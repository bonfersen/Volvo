package com.sutran.client.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sutran.client.bean.GenTbVehiculo;
import com.sutran.client.dao.GenTbVehiculoMapper;
import com.sutran.client.service.GenTbVehiculoService;
import com.sutran.client.util.CriteriaManager;

@Service
public class GenTbVehiculoServiceImpl implements GenTbVehiculoService {

	@Autowired
	private GenTbVehiculoMapper genTbVehiculoMapper;
	
	public int save(GenTbVehiculo bean) throws Exception {
		if (bean.getIdVehiculo() == null)
			return genTbVehiculoMapper.insert(bean);
		else
			return genTbVehiculoMapper.updateByPrimaryKeySelective(bean);
	}

	public List<GenTbVehiculo> select(CriteriaManager criteriaManager) throws Exception {
		return genTbVehiculoMapper.selectByExample(criteriaManager);
	}

	public GenTbVehiculo selectByPrimaryKey(Integer primaryKey) throws Exception {
		return genTbVehiculoMapper.selectByPrimaryKey(primaryKey);
	}
}
