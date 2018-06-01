package com.volvobuses.client.serviceImpl;

import java.net.URL;
import java.util.Date;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.contract.ArrayOfTimedPositionType;
import org.contract.ArrayOfVehicleType;
import org.contract.TimedPositionType;
import org.contract.VehicleType;
import org.springframework.stereotype.Service;
import org.tempuri.FleetMgmtService;
import org.tempuri.IExternalFleetMgmtService;
import org.tempuri.IExternalFleetMgmtServiceLoginFleetMgmtExceptionFaultFaultMessage;

import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintArrayOfTimedPositionfi2YCEuP;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint;
import com.volvobuses.client.main.VolvoBusesScheduledJob;
import com.volvobuses.client.service.VolvoBusesService;
import com.volvobuses.client.util.VolvoBusesConstants;

@Service("volvoBusesService")
public class VolvoBusesServiceImpl extends Thread implements VolvoBusesService {

	private static final Logger logger = LogManager.getLogger(VolvoBusesScheduledJob.class);

	/*
	@Autowired
	private GenTbFlotaService genTbFlotaService;

	@Autowired
	private GenTbVehiculoService genTbVehiculoService;

	@Autowired
	private GenTbVehiculodetalleService genTbVehiculodetalleService;

	@Autowired
	private GenTbHorometroService genTbHorometroService;

	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public int saveVehiculo(GenTbVehiculo bean) throws Exception {
		return genTbVehiculoService.save(bean);
	}

	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public int saveVehiculoDetalle(GenTbVehiculodetalle bean) throws Exception {
		return genTbVehiculodetalleService.save(bean);
	}

	public List<GenTbFlota> selectFlotas() throws Exception {
		CriteriaManager criteriaManager = new CriteriaManager();
		criteriaManager.createCriteria().andFieldEqualTo("activo", SutranClientConstants.ACTIVO);
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
	}*/

	public void startConectionDynafleeApi() throws Exception {
		logger.info("Iniciando comunicacion con los servicios de FleetMgmt");
		IExternalFleetMgmtService port = getURLConnection().getBasicHttps();
		String srtLogin = null;
		String srtVin =  null;
		
		try {
			/*
			 * Login
			 */
			srtLogin = port.login("PeruBusApi", "Jya540766hkK");
			logger.info("login.result=" + srtLogin);
			String loginSession = srtLogin;
            /*
             * GetVehicles
             */
			int indice = 0;
            ArrayOfVehicleType arrayOfVehicleType = port.getVehicles(loginSession);
            //arrayOfVehicleType.getVehicle());
            for (VehicleType vehicleType : arrayOfVehicleType.getVehicle()) {
            	logger.info("Vehiculos ---------------------------");
            	logger.info("vin.result=" + vehicleType.getVin().getValue());
            	logger.info("company.result=" + vehicleType.getCompanyId().longValue());
            	logger.info("id.result=" + vehicleType.getId());
            	
            	ArrayOfint arrayOfint = new ArrayOfint();
        		XMLGregorianCalendar from = javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2018-05-19T22:48:28.258-05:00");
        		XMLGregorianCalendar to = javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2018-05-20T22:48:28.258-05:00");
            	arrayOfint.getInt().add(vehicleType.getId());
            	
            	 /*
            	 * GetVehiclePositions
            	 */
                ArrayOfKeyValueOfintArrayOfTimedPositionfi2YCEuP array = port.getVehiclePositions(loginSession, arrayOfint, from, to);
                List<ArrayOfKeyValueOfintArrayOfTimedPositionfi2YCEuP.KeyValueOfintArrayOfTimedPositionfi2YCEuP> arrayB = array.getKeyValueOfintArrayOfTimedPositionfi2YCEuP();
                for (ArrayOfKeyValueOfintArrayOfTimedPositionfi2YCEuP.KeyValueOfintArrayOfTimedPositionfi2YCEuP a: arrayB) {
                	logger.info("-----------------------Posicionamiento del VehicleId.result = " + a.getKey());
                	for (TimedPositionType apt : a.getValue().getTimedPosition()) {
                		logger.info("altitude.result=" + apt.getAltitude().getValue());
                		logger.info("altitude.result=" + apt.getTimestamp().getValue());
                	}
                }
            }
           

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
