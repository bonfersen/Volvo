package com.volvobuses.client.serviceImpl;

import java.net.URL;
import java.util.Date;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.contract.ArrayOfDriverIntervalDataType;
import org.contract.ArrayOfDriverType;
import org.contract.ArrayOfEventDataType;
import org.contract.ArrayOfEventTypeType;
import org.contract.ArrayOfVehicleType;
import org.contract.DriverIntervalDataType;
import org.contract.DriverType;
import org.contract.EventDataType;
import org.contract.EventTypeType;
import org.contract.TimedPositionType;
import org.contract.VehicleType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.tempuri.FleetMgmtService;
import org.tempuri.IExternalFleetMgmtService;
import org.tempuri.IExternalFleetMgmtServiceLoginFleetMgmtExceptionFaultFaultMessage;

import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintArrayOfTimedPositionfi2YCEuP;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint;
import com.volvobuses.client.bean.GenTbBusesdetalle;
import com.volvobuses.client.bean.GenTbFlota;
import com.volvobuses.client.bean.GenTbVehiculo;
import com.volvobuses.client.service.GenTbBusesDetalleService;
import com.volvobuses.client.service.GenTbFlotaService;
import com.volvobuses.client.service.GenTbParametricaService;
import com.volvobuses.client.service.GenTbVehiculoService;
import com.volvobuses.client.service.VolvoBusesService;
import com.volvobuses.client.util.CriteriaManager;
import com.volvobuses.client.util.VolvoBusesConstants;

@Service("volvoBusesService")
public class VolvoBusesServiceImpl extends Thread implements VolvoBusesService {

	private static final Logger logger = LogManager.getLogger(VolvoBusesServiceImpl.class);
	
	@Autowired
	private GenTbFlotaService genTbFlotaService;

	@Autowired
	private GenTbVehiculoService genTbVehiculoService;

	@Autowired
	private GenTbBusesDetalleService genTbBusesDetalleService;

	@Autowired
	private GenTbParametricaService genTbParametricaService;

	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public int saveVehiculo(GenTbVehiculo bean) throws Exception {
		return genTbVehiculoService.save(bean);
	}

	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public int saveVehiculoDetalle(GenTbBusesdetalle bean) throws Exception {
		return genTbBusesDetalleService.save(bean);
	}

	public List<GenTbFlota> selectFlotas() throws Exception {
		CriteriaManager criteriaManager = new CriteriaManager();
		criteriaManager.createCriteria().andFieldEqualTo("activo", VolvoBusesConstants.ACTIVO).andFieldEqualTo("tipoFlota", VolvoBusesConstants.CADENA_UNO);
		return genTbFlotaService.select(criteriaManager);
	}

	public GenTbVehiculo selectVehiculoByIdVehiculoApi(Long idVehiculoApi, Integer idFlota) throws Exception {
		CriteriaManager criteriaManagerVehiculo = new CriteriaManager();
		criteriaManagerVehiculo.createCriteria().andFieldEqualTo("idVehiculoApi", idVehiculoApi).andFieldEqualTo("idFlota", idFlota);
		List<GenTbVehiculo> lstGenTbVehiculo = genTbVehiculoService.select(criteriaManagerVehiculo);

		if (lstGenTbVehiculo.size() > 1) {
			throw new Exception("El id del vehiculo se encuentra repetido para el mismo usuario");
		}

		return (lstGenTbVehiculo.size() > 0) ? lstGenTbVehiculo.get(0) : null;
	}

	public void startConectionDynafleeApi() throws Exception {
		logger.info("-----------------------Iniciando comunicacion  con los servicios de FleetMgmt");
		IExternalFleetMgmtService port = getURLConnection().getBasicHttps();
		String srtLogin = null;
		
		try {
			/*
			 * Rango de fechas de busqueda
			 */
			XMLGregorianCalendar from = javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2018-05-19T22:48:28.258-05:00");
    		XMLGregorianCalendar to = javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2018-05-20T22:48:28.258-05:00");
			
			/*
			 * Login
			 */
			srtLogin = port.login("PeruBusApi", "Jya540766hkK");
			logger.info("login.result=" + srtLogin);
			String loginSession = srtLogin;
			
            /*
             * GetVehicles
             */
            ArrayOfVehicleType arrayOfVehicleType = port.getVehicles(loginSession);

            for (VehicleType vehicleType : arrayOfVehicleType.getVehicle()) {
            	logger.info("GetVehicles ---------------------------");
            	logger.info("vin=" + vehicleType.getChassiId().getValue()); // VIN
            	logger.info("company=" + vehicleType.getCompanyId().longValue());
            	logger.info("id=" + vehicleType.getId()); // Id unico por vehiculo
            	
            	// CompanyId : relaciona a empresa con sus vehículos y usuarios 
            	
            	ArrayOfint arrayOfint = new ArrayOfint();
        		arrayOfint.getInt().add(vehicleType.getId());
            	
            	/*
            	 * GetVehiclePositions
            	 */
                ArrayOfKeyValueOfintArrayOfTimedPositionfi2YCEuP array = port.getVehiclePositions(loginSession, arrayOfint, from, to);
                List<ArrayOfKeyValueOfintArrayOfTimedPositionfi2YCEuP.KeyValueOfintArrayOfTimedPositionfi2YCEuP> arrayB = array.getKeyValueOfintArrayOfTimedPositionfi2YCEuP();
                for (ArrayOfKeyValueOfintArrayOfTimedPositionfi2YCEuP.KeyValueOfintArrayOfTimedPositionfi2YCEuP a: arrayB) {
                	logger.info("-----------------------Posicionamiento del VehicleId = " + a.getKey());
                	for (TimedPositionType apt : a.getValue().getTimedPosition()) {
                		logger.info("Latitude=" + apt.getLatitude().getValue());
                		logger.info("Longitud=" + apt.getLongitude().getValue());
                		logger.info("fecha envio de la posicion=" + apt.getTimestamp().getValue());
                	}
                }    
                
                /*
                 * GetVehicleEvents
                 */
                ArrayOfEventTypeType arrayOfEventTypeType = new ArrayOfEventTypeType();
                arrayOfEventTypeType.getEventType().add(EventTypeType.PANIC_ALARM_ACTIVATE);
                arrayOfEventTypeType.getEventType().add(EventTypeType.PANIC_ALARM_UPDATE);
                arrayOfEventTypeType.getEventType().add(EventTypeType.PANIC_ALARM_DEACTIVATE);
                arrayOfEventTypeType.getEventType().add(EventTypeType.PANIC_ALARM_STATIONARY_LIMIT);
                arrayOfEventTypeType.getEventType().add(EventTypeType.OVERSPEED_EXCEEDED);
                ArrayOfEventDataType arrayOfEventDataType = port.getVehicleEvents(loginSession, arrayOfint, arrayOfEventTypeType, from, to);
                for (EventDataType eventDataType : arrayOfEventDataType.getEventData()) {
                	logger.info("Nombre de Evento=" + eventDataType.getEventType().name());
                	logger.info("Fecha Evento=" + eventDataType.getTimestamp().toString());
                }
            }
		
            /*
             * GetDrivers
             */
            ArrayOfDriverType arrayOfDriverType = port.getDrivers(loginSession);
            for(DriverType driverType : arrayOfDriverType.getDriver()) {
            	ArrayOfint arrayOfint = new ArrayOfint();
        		arrayOfint.getInt().add(driverType.getId());
            	/*
                 * GetDriverSpeedIntervals
                 */
        		ArrayOfDriverIntervalDataType arrayOfDriverIntervalDataType = port.getDriverSpeedIntervals(loginSession, arrayOfint, from, to);
        		logger.info("----------------------- Velocidad del Conductor: " + driverType.getId());
        		for(DriverIntervalDataType driverIntervalDataType : arrayOfDriverIntervalDataType.getDriverIntervalData()) {
        			logger.info("Distance=" + driverIntervalDataType.getDistance());//Fuel, time and distance per speed interval and driver
        		}
            }
            
            //Fechaemv Debe ser creado en nuestra base de datos
           

        } catch (IExternalFleetMgmtServiceLoginFleetMgmtExceptionFaultFaultMessage e) { 
        	logger.info("Expected exception: IExternalFleetMgmtService_Login_FleetMgmtExceptionFault_FaultMessage has occurred.");
        	logger.info(e.toString());
        }
		


		logger.info(
				"-----------------------Finalizo proceso de almacenamiento: " + this.getId() + ", Fecha/Hora: " + new Date());
	}

	
	private FleetMgmtService getURLConnection() {
		URL wsdlURL = FleetMgmtService.WSDL_LOCATION;
		return new FleetMgmtService(wsdlURL, VolvoBusesConstants.SERVICE_NAME);
	}
}
