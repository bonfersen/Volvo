package com.volvobuses.client.service;

import java.util.List;

import com.volvobuses.client.bean.GenTbFlota;
import com.volvobuses.client.bean.GenTbVehiculo;

public interface VolvoBusesService {

	public List<GenTbFlota> selectFlotas() throws Exception;
	
	public int saveVehiculo(GenTbVehiculo bean) throws Exception;
	
	public void startConectionDynafleeApi() throws Exception;
	
	public GenTbVehiculo selectVehiculoByIdVehiculoApi(Long idVehiculoApi, Integer idFlota) throws Exception;
}
