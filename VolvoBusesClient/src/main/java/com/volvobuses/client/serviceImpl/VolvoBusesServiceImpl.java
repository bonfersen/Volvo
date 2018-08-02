package com.volvobuses.client.serviceImpl;

import java.math.BigDecimal;
import java.net.URL;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.contract.ArrayOfEventDataType;
import org.contract.ArrayOfEventTypeType;
import org.contract.ArrayOfVehicleType;
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
import com.volvobuses.client.bean.GenTbBuseseventos;
import com.volvobuses.client.bean.GenTbFlota;
import com.volvobuses.client.bean.GenTbParametrica;
import com.volvobuses.client.bean.GenTbVehiculo;
import com.volvobuses.client.service.GenTbBusesDetalleService;
import com.volvobuses.client.service.GenTbBusesEventoService;
import com.volvobuses.client.service.GenTbFlotaService;
import com.volvobuses.client.service.GenTbParametricaService;
import com.volvobuses.client.service.GenTbVehiculoService;
import com.volvobuses.client.service.VolvoBusesService;
import com.volvobuses.client.util.CriteriaManager;
import com.volvobuses.client.util.LatLng;
import com.volvobuses.client.util.ValidateUtil;
import com.volvobuses.client.util.VolvoBusesConstants;
import com.volvobuses.client.util.VolvoUtil;

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
	private GenTbBusesEventoService genTbBusesEventosService;

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

	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void startConectionDynafleeApi() throws Exception {
		logger.info("-----------------------Iniciando comunicacion  con los servicios de FleetMgmt");
		URL url = null;
		String srtLogin = null;
		int tiempoHorasPeticion;

		/*
		 * Obtener parametros
		 */
		CriteriaManager criteriaManagerURL = new CriteriaManager();
		criteriaManagerURL.createCriteria().andFieldEqualTo("paraId", VolvoBusesConstants.URL_TELEMETRIA_BUSES).andFieldEqualTo("activo", VolvoBusesConstants.ACTIVO);
		List<GenTbParametrica> lstParametricaURL = genTbParametricaService.select(criteriaManagerURL);
		if (lstParametricaURL.size() > 0) {
			url = new URL(lstParametricaURL.get(0).getValor());
		}
		else
			throw new Exception("La URL para consumir el servicio no se encuentra en la BD");

		CriteriaManager criteriaManagerTiempoConsumo = new CriteriaManager();
		criteriaManagerTiempoConsumo.createCriteria().andFieldEqualTo("paraId", VolvoBusesConstants.TIEMPO_HORAS_CONSUMO_TELEMETRIA_BUSES).andFieldEqualTo("activo",
				VolvoBusesConstants.ACTIVO);
		List<GenTbParametrica> lstParametricaTiempoConsumo = genTbParametricaService.select(criteriaManagerTiempoConsumo);
		if (lstParametricaTiempoConsumo.size() > 0) {
			tiempoHorasPeticion = Integer.valueOf(lstParametricaTiempoConsumo.get(0).getValor()).intValue();
		}
		else
			throw new Exception("El tiempo en horas para consumir el servicio no se encuentra en la BD");

		IExternalFleetMgmtService port = getURLConnection(url).getBasicHttps();

		try {
			/*
			 * Rango de fechas de busqueda
			 */
			XMLGregorianCalendar xmlCalendarFrom = DatatypeFactory.newInstance().newXMLGregorianCalendar("2018-05-19T22:48:28.258-05:00");
			GregorianCalendar calendar = xmlCalendarFrom.toGregorianCalendar();
			calendar.add(Calendar.HOUR_OF_DAY, tiempoHorasPeticion);
			XMLGregorianCalendar xmlCalendarTo = DatatypeFactory.newInstance().newXMLGregorianCalendar(calendar);
			/*
			 * Array de eventos a detectar
			 */
			ArrayOfEventTypeType arrayOfEventTypeType = new ArrayOfEventTypeType();
			arrayOfEventTypeType.getEventType().add(EventTypeType.UNSPECIFIED);
			arrayOfEventTypeType.getEventType().add(EventTypeType.HARSH_ACCELERATION);
			arrayOfEventTypeType.getEventType().add(EventTypeType.HARSH_BRAKING);
			arrayOfEventTypeType.getEventType().add(EventTypeType.HARSH_CURVING);
			arrayOfEventTypeType.getEventType().add(EventTypeType.OVERSPEED_CLEARED);
			arrayOfEventTypeType.getEventType().add(EventTypeType.ALCOLOCK_POSITIVE);
			arrayOfEventTypeType.getEventType().add(EventTypeType.PANIC_ALARM_ACTIVATE);// Sutran
			arrayOfEventTypeType.getEventType().add(EventTypeType.PANIC_ALARM_UPDATE);
			arrayOfEventTypeType.getEventType().add(EventTypeType.PANIC_ALARM_DEACTIVATE);
			arrayOfEventTypeType.getEventType().add(EventTypeType.PANIC_ALARM_STATIONARY_LIMIT);
			arrayOfEventTypeType.getEventType().add(EventTypeType.OVERSPEED_EXCEEDED);

			/*
			 * Login
			 */
			List<GenTbFlota> lstFlotas = this.selectFlotas();
			for (GenTbFlota genTbFlota : lstFlotas) {
				srtLogin = port.login(genTbFlota.getUsuario(), genTbFlota.getPassword());
				logger.info("login.result=" + srtLogin);
				String loginSession = srtLogin;
				/*
				 * GetVehicles
				 */
				ArrayOfVehicleType arrayOfVehicleType = port.getVehicles(loginSession);

				for (VehicleType vehicleType : arrayOfVehicleType.getVehicle()) {
					GenTbVehiculo genTbVehiculo = new GenTbVehiculo();
					Long idVehiculoApi = Long.valueOf(vehicleType.getId()).longValue();
					Double latitudApi = null;
					Double longitudApi = null;

					logger.info("GetVehicles ---------------------------");
					logger.debug("Company=" + vehicleType.getCompanyId().longValue()); // relaciona a empresa con sus vehículos y usuarios
					genTbVehiculo.setIdFlota(genTbFlota.getIdFlota());
					logger.debug("vin=" + vehicleType.getChassiId().getValue()); // VIN
					genTbVehiculo.setVin(vehicleType.getChassiId().getValue());
					logger.debug("id=" + vehicleType.getId()); // Id unico por vehiculo
					genTbVehiculo.setIdVehiculoApi(idVehiculoApi);
					genTbVehiculo.setFechaRegistroApi(new Date());// fechaemv

					/*
					 * Verificar si existe el Id vehiculo en la base de datos, si existe se ingresa el vehiculo
					 */
					GenTbVehiculo genTbVehiculoTemp = selectVehiculoByIdVehiculoApi(idVehiculoApi, genTbFlota.getIdFlota());
					if (ValidateUtil.isEmpty(genTbVehiculoTemp)) {
						this.saveVehiculo(genTbVehiculo);
						logger.info("Se almaceno informacion de vehiculo");
					}
					else if (ValidateUtil.isNotEmpty(genTbVehiculoTemp) && ValidateUtil.isEmpty(genTbVehiculoTemp.getVin())) {
						genTbVehiculo.setIdVehiculo(genTbVehiculoTemp.getIdVehiculo());
						this.saveVehiculo(genTbVehiculo);
						logger.info("El VIN se actualizo");
					}
					else {
						logger.debug("El vehiculo existe");
					}

					ArrayOfint arrayVehicleId = new ArrayOfint();
					arrayVehicleId.getInt().add(vehicleType.getId());

					/*
					 * GetVehiclePositions
					 */
					ArrayOfKeyValueOfintArrayOfTimedPositionfi2YCEuP array = port.getVehiclePositions(loginSession, arrayVehicleId, xmlCalendarFrom, xmlCalendarTo);
					List<ArrayOfKeyValueOfintArrayOfTimedPositionfi2YCEuP.KeyValueOfintArrayOfTimedPositionfi2YCEuP> arrayB = array.getKeyValueOfintArrayOfTimedPositionfi2YCEuP();
					for (ArrayOfKeyValueOfintArrayOfTimedPositionfi2YCEuP.KeyValueOfintArrayOfTimedPositionfi2YCEuP a : arrayB) {
						logger.info("-----------------------Posicionamiento del VehicleId = " + a.getKey());

						for (TimedPositionType apt : a.getValue().getTimedPosition()) {
							GenTbBusesdetalle genTbBusesdetalle = new GenTbBusesdetalle();

							/*
							 * Buscar el id del vehiculo en base de datos local
							 */
							GenTbVehiculo genTbVehiculoEntity = selectVehiculoByIdVehiculoApi(new Long(a.getKey()), genTbFlota.getIdFlota());
							if (ValidateUtil.isNotEmpty(genTbVehiculoEntity)) {
								genTbBusesdetalle.setIdVehiculo(genTbVehiculoEntity.getIdVehiculo());

								if (ValidateUtil.isNotEmpty(apt.getLatitude())) {
									latitudApi = new Double(apt.getLatitude().getValue());
									logger.debug("Latitude=" + latitudApi);
									final BigDecimal latitudValue = new BigDecimal(latitudApi.toString());
									BigDecimal latitude = new BigDecimal(latitudValue.toPlainString().toString());
									genTbBusesdetalle.setLatitud(latitude);
								}

								if (ValidateUtil.isNotEmpty(apt.getLongitude())) {
									longitudApi = new Double(apt.getLongitude().getValue());
									logger.debug("Longitud=" + longitudApi);
									final BigDecimal longitudValue = new BigDecimal(longitudApi.toString());
									BigDecimal longitude = new BigDecimal(longitudValue.toPlainString().toString());
									genTbBusesdetalle.setLongitud(longitude);
								}

								// Calculo del rumbo
								if (ValidateUtil.isNotEmpty(latitudApi) && ValidateUtil.isNotEmpty(longitudApi)) {
									LatLng src = new LatLng(latitudApi, longitudApi);
									LatLng dst = new LatLng(0, 0);
									double rumboDouble = VolvoUtil.bearingInDegrees(src, dst);
									int rumboInt = (int) Math.round(Math.floor(rumboDouble));
									logger.debug("Rumbo=" + rumboInt);
									genTbBusesdetalle.setRumbo(rumboInt);
								}

								if (ValidateUtil.isNotEmpty(apt.getTimestamp().getValue())) {
									Date fechaRegistroGPS = apt.getTimestamp().getValue().toGregorianCalendar().getTime();
									logger.debug("fecha registro GPS=" + fechaRegistroGPS); // Fecha
									genTbBusesdetalle.setFechaRegistroGPS(fechaRegistroGPS);
								}
								genTbBusesdetalle.setEstaTransmitido(VolvoBusesConstants.CERO);
								genTbBusesDetalleService.save(genTbBusesdetalle);
							}
						}
					}

					/*
					 * GetVehicleEvents
					 */
					ArrayOfEventDataType arrayOfEventDataType = port.getVehicleEvents(loginSession, arrayVehicleId, arrayOfEventTypeType, xmlCalendarFrom, xmlCalendarTo);
					for (EventDataType eventDataType : arrayOfEventDataType.getEventData()) {
						GenTbBuseseventos genTbBuseseventos = new GenTbBuseseventos();
						/*
						 * Buscar el id del vehiculo en base de datos local
						 */
						GenTbVehiculo genTbVehiculoEntity = selectVehiculoByIdVehiculoApi(new Long(eventDataType.getVehicleId().getValue()), genTbFlota.getIdFlota());
						if (ValidateUtil.isNotEmpty(genTbVehiculoEntity)) {
							genTbBuseseventos.setIdVehiculo(genTbVehiculoEntity.getIdVehiculo());
							
							if (ValidateUtil.isNotEmpty(eventDataType.getEventType())) {
								logger.debug("Nombre de Evento=" + eventDataType.getEventType().name());
								genTbBuseseventos.setNombreEvento(eventDataType.getEventType().name());
							}
							if (ValidateUtil.isNotEmpty(eventDataType.getTimestamp())) {
								Date fechaEvento = eventDataType.getTimestamp().toGregorianCalendar().getTime();
								logger.debug("Fecha Evento=" + eventDataType.getTimestamp().toString());
								genTbBuseseventos.setFechaEvento(fechaEvento);
							}
							logger.debug("Driver id Evento=" + eventDataType.getDriverId().getValue());
							genTbBusesEventosService.save(genTbBuseseventos);
						}
					}
				}

				// Calculo de velocidad (pendiente)
				/*
				 * GetDrivers, se obtiene la info de conductores por usuario o flota
				 */
				// ArrayOfDriverType arrayOfDriverType = port.getDrivers(loginSession);
				// for (DriverType driverType : arrayOfDriverType.getDriver()) {
				// ArrayOfint arrayOfDriverId = new ArrayOfint();
				//
				// // if (ValidateUtil.isNotEmpty(eventDataType.getDriverId().getValue())) {
				// int driverId = driverType.getId();
				// arrayOfDriverId.getInt().add(driverId);
				// /*
				// * GetDriverSpeedIntervals
				// */
				// ArrayOfDriverIntervalDataType arrayOfDriverIntervalDataType = port.getDriverSpeedIntervals(loginSession,
				// arrayOfDriverId, xmlCalendarFrom, xmlCalendarTo);
				// logger.info("----------------------- GetDriverSpeedIntervals id: " + driverId);
				// for (DriverIntervalDataType driverIntervalDataType : arrayOfDriverIntervalDataType.getDriverIntervalData()) {
				// if (ValidateUtil.isNotEmpty(driverIntervalDataType.getFuel())) {
				// logger.debug("Fuel=" + driverIntervalDataType.getFuel());// Fuel, galones americanos
				// }
				// }
				// }
			}
		}
		catch (IExternalFleetMgmtServiceLoginFleetMgmtExceptionFaultFaultMessage e) {
			logger.info("Expected exception: IExternalFleetMgmtService_Login_FleetMgmtExceptionFault_FaultMessage has occurred.");
			logger.debug(e.toString());
		}

		logger.info("-----------------------Finalizo proceso de almacenamiento: " + this.getId() + ", Fecha/Hora: " + new Date());
	}

	private FleetMgmtService getURLConnection(URL wsdlURL) {
		if (wsdlURL == null)
			wsdlURL = FleetMgmtService.WSDL_LOCATION;
		return new FleetMgmtService(wsdlURL, VolvoBusesConstants.SERVICE_NAME);
	}
}
