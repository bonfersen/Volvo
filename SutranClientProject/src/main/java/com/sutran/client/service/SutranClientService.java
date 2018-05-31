package com.sutran.client.service;

import java.util.List;

import com.sutran.client.bean.GenTbFlota;
import com.sutran.client.bean.GenTbVehiculo;
import com.sutran.client.bean.GenTbVehiculodetalle;
import com.wirelesscar.dynafleet.api.DynafleetAPIException;

public interface SutranClientService {

	public List<GenTbFlota> selectFlotas() throws Exception;
	
	public int saveVehiculo(GenTbVehiculo bean) throws Exception;
	
	public int saveVehiculoDetalle(GenTbVehiculodetalle bean) throws Exception;
	
	public void startConectionDynafleeApi() throws DynafleetAPIException, Exception;
	
	public GenTbVehiculo selectVehiculoByIdVehiculoApi(Long idVehiculoApi, Integer idFlota) throws Exception;
}
