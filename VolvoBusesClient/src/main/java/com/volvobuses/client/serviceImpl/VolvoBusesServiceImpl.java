package com.volvobuses.client.serviceImpl;

import java.net.URL;
import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;
import org.tempuri.FleetMgmtService;
import org.tempuri.IExternalFleetMgmtService;
import org.tempuri.IExternalFleetMgmtServiceLoginFleetMgmtExceptionFaultFaultMessage;

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
		
		try {
			String portLogin = port.login("PeruBusApi", "Jya540766hkK");
            System.out.println("login.result=" + portLogin);

        } catch (IExternalFleetMgmtServiceLoginFleetMgmtExceptionFaultFaultMessage e) { 
            System.out.println("Expected exception: IExternalFleetMgmtService_Login_FleetMgmtExceptionFault_FaultMessage has occurred.");
            System.out.println(e.toString());
        }
		


		logger.info(
				"-----------------------Finalizo proceso de almacenamiento de todos los usuarios. Id Hilo: " + this.getId() + ", Fecha/Hora: " + new Date());
	}

	
	private FleetMgmtService getURLConnection() {
		URL wsdlURL = FleetMgmtService.WSDL_LOCATION;
		return new FleetMgmtService(wsdlURL, VolvoBusesConstants.SERVICE_NAME);
	}
}
