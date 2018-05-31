package com.sutran.client.serviceImpl;

import java.math.BigDecimal;
import java.net.URL;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.sutran.client.bean.GenTbFlota;
import com.sutran.client.bean.GenTbHorometro;
import com.sutran.client.bean.GenTbVehiculo;
import com.sutran.client.bean.GenTbVehiculodetalle;
import com.sutran.client.main.SutranClientScheduledJob;
import com.sutran.client.service.GenTbFlotaService;
import com.sutran.client.service.GenTbHorometroService;
import com.sutran.client.service.GenTbVehiculoService;
import com.sutran.client.service.GenTbVehiculodetalleService;
import com.sutran.client.service.SutranClientService;
import com.sutran.client.util.CriteriaManager;
import com.sutran.client.util.LatLng;
import com.sutran.client.util.SutranClientConstants;
import com.sutran.client.util.SutranUtil;
import com.sutran.client.util.ValidateUtil;
import com.wirelesscar.dynafleet.api.DynafleetAPI;
import com.wirelesscar.dynafleet.api.DynafleetAPIException;
import com.wirelesscar.dynafleet.api.LoginService;
import com.wirelesscar.dynafleet.api.ReportService;
import com.wirelesscar.dynafleet.api.TrackingService;
import com.wirelesscar.dynafleet.api.VehicleAndDriverAdminService;
import com.wirelesscar.dynafleet.api.types.ApiInteger;
import com.wirelesscar.dynafleet.api.types.ApiLoginLoginTO;
import com.wirelesscar.dynafleet.api.types.ApiPositionTO;
import com.wirelesscar.dynafleet.api.types.ApiSessionId;
import com.wirelesscar.dynafleet.api.types.ApiTrackingDataV2ArrayTO;
import com.wirelesscar.dynafleet.api.types.ApiTrackingDataV2TO;
import com.wirelesscar.dynafleet.api.types.ApiVADAdminGetVehicleTO;
import com.wirelesscar.dynafleet.api.types.ApiVehicleDataEntryExtendedTO;
import com.wirelesscar.dynafleet.api.types.ApiVehicleDataExtendedArrayTO;
import com.wirelesscar.dynafleet.api.types.ApiVehicleDataExtendedTO;
import com.wirelesscar.dynafleet.api.types.ApiVehicleId;
import com.wirelesscar.dynafleet.api.types.ApiVehicleInfoV2ArrayTO;
import com.wirelesscar.dynafleet.api.types.ApiVehicleInfoV2TO;
import com.wirelesscar.dynafleet.api.types.ApiVehicleTO;

@Service("sutranClientService")
public class SutranClientServiceImpl extends Thread implements SutranClientService {

	private static final Logger logger = LogManager.getLogger(SutranClientScheduledJob.class);

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
	}

	public void startConectionDynafleeApi() throws DynafleetAPIException, Exception {
		logger.info("Iniciando comunicacion con los servicios de Dynafleet");
		LoginService portLogin = getURLConnection().getLoginServicePort();
		int loginCounter = 0;

		List<GenTbFlota> lstGenTbFlota = this.selectFlotas();

		for (GenTbFlota genTbFlota : lstGenTbFlota) {
			ApiSessionId apiSessionIdLogin = null;
			ApiLoginLoginTO apiLoginLoginTO = new ApiLoginLoginTO();
			ApiInteger apiLoginLoginTO1GmtOffset = new ApiInteger();
			apiLoginLoginTO1GmtOffset.setValue(0);
			apiLoginLoginTO.setGmtOffset(apiLoginLoginTO1GmtOffset);
			apiLoginLoginTO.setPassword(genTbFlota.getPassword());
			apiLoginLoginTO.setUsername(genTbFlota.getUsuario());

			apiSessionIdLogin = portLogin.login(apiLoginLoginTO);
			logger.info("Login successful: " + apiSessionIdLogin.getId());

			// Se almacena la informacion de uso de la flota
			saveVehiclesData(apiSessionIdLogin, genTbFlota);

			// Horometro, horas de uso acumulado
			// getHorometro(apiSessionIdLogin, genTbFlota);

			logger.info("Finalizo proceso de almacenamiento del usuario: " + genTbFlota.getIdFlota() + " - " + genTbFlota.getNombreFlota() + ", id Hilo: "
					+ this.getId() + ", Fecha/Hora: " + new Date());

			loginCounter++;
			if (loginCounter == SutranClientConstants.MAX_CANTIDAD_CONSUMOS_LOGIN) {
				logger.info("Se llego al maximo consumo de metodos en Login: " + loginCounter);
				this.sleep(SutranClientConstants.TIEMPO_ESPERA_CONSUMO_WEBSERVICE_POR_LOGIN);
				loginCounter = 0;
			}

			// Cerrando Sesion
			logger.debug("---------Invoking logout...");
			ApiSessionId apiSessionIdLogout = new ApiSessionId();
			apiSessionIdLogout.setId(apiSessionIdLogin.getId());
			portLogin.logout(apiSessionIdLogout);

		}
		logger.info(
				"-----------------------Finalizo proceso de almacenamiento de todos los usuarios. Id Hilo: " + this.getId() + ", Fecha/Hora: " + new Date());
	}

	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	private void saveVehiclesData(ApiSessionId apiSessionIdLogin, GenTbFlota genTbFlota) throws DynafleetAPIException, Exception {
		VehicleAndDriverAdminService portVehicleAndDriver = getURLConnection().getVehicleAndDriverAdminServicePort();
		ApiVehicleId apiVehicleId = null;
		boolean seEncontroDetalleVehiculo = false;
		boolean seEncontroHorometro = false;
		int functionCounterVehicles = 0;
		int functionCounterVehiclesDetails = 0;

		/*
		 * Obtener vehiculos getVehiclesV2: Id del vehiculo, Portal name, VIN
		 */
		ApiVehicleInfoV2ArrayTO lstApiVehicleInfoV2ArrayTO = portVehicleAndDriver.getVehiclesV2(apiSessionIdLogin);
		List<ApiVehicleInfoV2TO> lstApiVehicleInfoV2TO = lstApiVehicleInfoV2ArrayTO.getVehicleInfos();
		logger.info("Tamanyo de lista de vehiculos encontrados: " + lstApiVehicleInfoV2TO.size());
		for (ApiVehicleInfoV2TO apiVehicleInfoV2TO : lstApiVehicleInfoV2TO) {
			GenTbVehiculo genTbVehiculo = new GenTbVehiculo();
			logger.debug("---------Invoking getVehiclesV2...");
			logger.debug("getVehiclesV2.DisplayName=" + apiVehicleInfoV2TO.getDisplayName());
			apiVehicleId = apiVehicleInfoV2TO.getVehicleId();
			logger.debug("getVehiclesV2.getVehicleId=" + apiVehicleId.getId());
			Long idVehiculoApi = apiVehicleId.getId();
			genTbVehiculo.setIdVehiculoApi(idVehiculoApi);
			logger.debug("getVehiclesV2.Vin=" + apiVehicleInfoV2TO.getVin());
			genTbVehiculo.setVin(apiVehicleInfoV2TO.getVin());

			/*
			 * Obtener vehiculo getVehicle: registration date, registration number per vehicle
			 */
			logger.debug("---------Invoking getVehicle...");
			ApiVADAdminGetVehicleTO apiVADAdminGetVehicleTO = new ApiVADAdminGetVehicleTO();

			apiVADAdminGetVehicleTO.setSessionId(apiSessionIdLogin);
			apiVADAdminGetVehicleTO.setVehicleId(apiVehicleId);

			ApiVehicleTO apiVehicleTO = portVehicleAndDriver.getVehicle(apiVADAdminGetVehicleTO);
			logger.debug("Vin.result=" + apiVehicleTO.getVIN());
			logger.debug("getVehicle.getVehicleId=" + apiVehicleTO.getVehicleId().getId());
			if (ValidateUtil.isNotEmpty(apiVehicleTO.getRegistrationDate())) {
				GregorianCalendar fechaEmvGregorianCalendar = apiVehicleTO.getRegistrationDate().getValue().toGregorianCalendar();
				logger.debug("getVehicle.getRegistrationDate=" + fechaEmvGregorianCalendar.getTime().toString()); // fechaemv
				genTbVehiculo.setFechaRegistroApi(fechaEmvGregorianCalendar.getTime());
			}
			logger.debug("getVehicle.getRegistrationNumber=" + apiVehicleTO.getRegistrationNumber());
			genTbVehiculo.setPlaca(apiVehicleTO.getRegistrationNumber());
			genTbVehiculo.setIdFlota(genTbFlota.getIdFlota());

			// Verificar si existe el Id vehiculo en la base de datos, si existe se ingresa el vehiculo
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

			functionCounterVehicles++;
			if (functionCounterVehicles == SutranClientConstants.MAX_CANTIDAD_CONSUMOS_METODO) {
				logger.info("Se llego al maximo consumo de metodos en getVehiclesV2: " + functionCounterVehicles);
				this.sleep(SutranClientConstants.TIEMPO_ESPERA_CONSUMO_WEBSERVICE_POR_METODO);
				functionCounterVehicles = 0;
			}
		}

		/*
		 * Obtener vehiculo getNewTrackingDataV2: longitud, latitud, speed, event, etc
		 */
		TrackingService portTrackingService = getURLConnection().getTrackingServicePort();
		logger.debug("---------Invoking getNewTrackingDataV2...");

		ApiTrackingDataV2ArrayTO lstApiTrackingDataV2ArrayTO = portTrackingService.getNewTrackingDataV2(apiSessionIdLogin);
		logger.info("Tamanyo de lista de detalle de vehiculos encontrados: " + lstApiTrackingDataV2ArrayTO.getArray().size());
		for (ApiTrackingDataV2TO apiTrackingDataV2TO : lstApiTrackingDataV2ArrayTO.getArray()) {
			Double latitudApi = null;
			Double longitudApi = null;
			GenTbVehiculodetalle genTbVehiculodetalle = new GenTbVehiculodetalle();
			seEncontroDetalleVehiculo = true;

			// Buscar el id del vehiculo en base de datos local
			Long idVehiculoApi = apiTrackingDataV2TO.getVehicleId().getId();
			GenTbVehiculo genTbVehiculoTemp = selectVehiculoByIdVehiculoApi(idVehiculoApi, genTbFlota.getIdFlota());
			genTbVehiculodetalle.setIdVehiculo(genTbVehiculoTemp.getIdVehiculo());

			ApiPositionTO apiPositionTO = apiTrackingDataV2TO.getPosition();
			logger.debug("getNewTrackingDataV2.getVehicleId=" + idVehiculoApi);

			if (ValidateUtil.isNotEmpty(apiPositionTO.getLatitude())) {
				logger.debug("getNewTrackingDataV2.getLatitude=" + apiPositionTO.getLatitude().getValue());
				latitudApi = new Double(apiPositionTO.getLatitude().getValue());
				final BigDecimal latitudValue = new BigDecimal(latitudApi.toString());
				BigDecimal latitude = new BigDecimal(latitudValue.toPlainString().toString());
				genTbVehiculodetalle.setLatitud(latitude);
			}

			if (ValidateUtil.isNotEmpty(apiPositionTO.getLongitude())) {
				logger.debug("getNewTrackingDataV2.getLongitude=" + apiPositionTO.getLongitude().getValue());
				longitudApi = new Double(apiPositionTO.getLongitude().getValue());
				final BigDecimal longitudValue = new BigDecimal(longitudApi.toString());
				BigDecimal longitude = new BigDecimal(longitudValue.toPlainString().toString());
				genTbVehiculodetalle.setLongitud(longitude);
			}

			// Calculo del rumbo
			if (ValidateUtil.isNotEmpty(latitudApi) && ValidateUtil.isNotEmpty(longitudApi)) {
				LatLng src = new LatLng(latitudApi, longitudApi);
				LatLng dst = new LatLng(0, 0);
				double rumboDouble = SutranUtil.bearingInDegrees(src, dst);
				int rumboInt = (int) Math.round(Math.floor(rumboDouble));
				genTbVehiculodetalle.setRumbo(rumboInt);
			}

			if (ValidateUtil.isNotEmpty(apiTrackingDataV2TO.getMomentaneousVehicleSpeed())) {
				logger.debug("getNewTrackingDataV2.getMomentaneousVehicleSpeed=" + apiTrackingDataV2TO.getMomentaneousVehicleSpeed().getValue());
				Integer velocidad = new Integer(String.valueOf(apiTrackingDataV2TO.getMomentaneousVehicleSpeed().getValue()).toString());
				genTbVehiculodetalle.setVelocidad(velocidad);
			}

			logger.debug("getNewTrackingDataV2.getTriggerType=" + apiTrackingDataV2TO.getTriggerType());
			genTbVehiculodetalle.setEvento(apiTrackingDataV2TO.getTriggerType());
			// Fecha de evento GPS
			if (ValidateUtil.isNotEmpty(apiPositionTO.getPositionTime())) {
				GregorianCalendar positionGregorianCalendar = apiPositionTO.getPositionTime().getValue().toGregorianCalendar();
				logger.debug("getNewTrackingDataV2.getFechaRegistroGPS=" + positionGregorianCalendar.getTime().toString());
				genTbVehiculodetalle.setFechaRegistroGPS(positionGregorianCalendar.getTime());
			}
			// Porcentaje de tanque de combustible
			if (ValidateUtil.isNotEmpty(apiTrackingDataV2TO.getCurrentFuelLevel())) {
				logger.debug("apiTrackingDataV2TO.getCurrentFuelLevel=" + apiTrackingDataV2TO.getCurrentFuelLevel().getValue());
				genTbVehiculodetalle.setPorcentajeCombustible(new BigDecimal(apiTrackingDataV2TO.getCurrentFuelLevel().getValue()));
			}
			// Total de Combustible consumido en centilitres
			if (ValidateUtil.isNotEmpty(apiTrackingDataV2TO.getAccumulatedFuelConsumption())) {
				logger.debug("apiTrackingDataV2TO.getAccumulatedFuelConsumption=" + apiTrackingDataV2TO.getAccumulatedFuelConsumption().getValue());
				genTbVehiculodetalle.setCombustibleAcumulado(apiTrackingDataV2TO.getAccumulatedFuelConsumption().getValue());
			}
			// Odometro, kilometraje acumulado
			if (ValidateUtil.isNotEmpty(apiTrackingDataV2TO.getOdometer())) {
				logger.debug("apiTrackingDataV2TO.getOdometer=" + apiTrackingDataV2TO.getOdometer().getValue());
				genTbVehiculodetalle.setOdometro(apiTrackingDataV2TO.getOdometer().getValue());
			}

			genTbVehiculodetalle.setEstaTransmitido(SutranClientConstants.CERO);
			genTbVehiculodetalleService.save(genTbVehiculodetalle);
			
			/*
			 * functionCounterVehiclesDetails++; if (functionCounterVehiclesDetails == SutranClientConstants.MAX_CANTIDAD_CONSUMOS_METODO) { logger.info(
			 * "Se llego al maximo consumo de metodos en getNewTrackingDataV2: " + functionCounterVehiclesDetails);
			 * this.sleep(SutranClientConstants.TIEMPO_ESPERA_CONSUMO_WEBSERVICE_POR_METODO); functionCounterVehiclesDetails = 0; }
			 */
		}
		if (seEncontroDetalleVehiculo)
			logger.info("Termino proceso de almacenamiento de informacion de detalle del vehiculo");
		else
			logger.info("No se encontro informacion de detalle del vehiculo");

		// Se busca el Horometro, horas de uso acumulado
		ReportService portReportService = getURLConnection().getReportServicePort();
		ApiVehicleDataExtendedArrayTO apiVehicleDataExtendedArrayTO = portReportService.getNewVehicleReportDataExtended(apiSessionIdLogin);
		List<ApiVehicleDataExtendedTO> lstApiVehicleDataExtendedTO = apiVehicleDataExtendedArrayTO.getArray();

		logger.debug("---------Invoking Horometro");
		for (ApiVehicleDataExtendedTO apiVehicleDataExtendedTO : lstApiVehicleDataExtendedTO) {
			List<ApiVehicleDataEntryExtendedTO> lstApiVehicleDataEntryExtendedTO = apiVehicleDataExtendedTO.getDataEntries();

			// Buscar el id del vehiculo en base de datos local
			Long idVehiculoApi2 = apiVehicleDataExtendedTO.getVehicleId().getId();
			GenTbVehiculo genTbVehiculoTemp2 = selectVehiculoByIdVehiculoApi(idVehiculoApi2, genTbFlota.getIdFlota());

			if (ValidateUtil.isNotEmpty(genTbVehiculoTemp2)) {
				for (ApiVehicleDataEntryExtendedTO apiVehicleDataEntryExtendedTO : lstApiVehicleDataEntryExtendedTO) {
					seEncontroHorometro = true;
					GenTbHorometro genTbHorometro = new GenTbHorometro();
					logger.debug("apiVehicleDataEntryExtendedTO.getEngineOnSeconds=" + apiVehicleDataEntryExtendedTO.getEngineOnSeconds().getValue());
					genTbHorometro.setHorometro(apiVehicleDataEntryExtendedTO.getEngineOnSeconds().getValue());
					logger.debug("apiVehicleDataEntryExtendedTO.getStartTime="
							+ apiVehicleDataEntryExtendedTO.getStartTime().getValue().toGregorianCalendar().getTime().toString());
					genTbHorometro.setFechaInicio(apiVehicleDataEntryExtendedTO.getStartTime().getValue().toGregorianCalendar().getTime());
					logger.debug("apiVehicleDataEntryExtendedTO.getEndTime="
							+ apiVehicleDataEntryExtendedTO.getEndTime().getValue().toGregorianCalendar().getTime().toString());
					genTbHorometro.setFechaFin(apiVehicleDataEntryExtendedTO.getEndTime().getValue().toGregorianCalendar().getTime());
					logger.debug(
							"apiVehicleDataEntryExtendedTO.getIdVehiculo=" + String.valueOf(apiVehicleDataExtendedTO.getVehicleId().getId()).toString());
					genTbHorometro.setIdVehiculo(genTbVehiculoTemp2.getIdVehiculo());
					
					genTbHorometroService.save(genTbHorometro);
				}
			}
		}		
		if (seEncontroHorometro)
			logger.info("Termino proceso de almacenamiento de informacion de Horometro");
		else
			logger.info("No se encontro informacion de Horometro");
	}

	private DynafleetAPI getURLConnection() {
		URL wsdlURL = DynafleetAPI.WSDL_LOCATION;
		return new DynafleetAPI(wsdlURL, SutranClientConstants.SERVICE_NAME);
	}
}
