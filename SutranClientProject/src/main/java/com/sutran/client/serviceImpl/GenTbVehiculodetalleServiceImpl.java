package com.sutran.client.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sutran.client.bean.GenTbVehiculodetalle;
import com.sutran.client.dao.GenTbVehiculodetalleMapper;
import com.sutran.client.service.GenTbVehiculodetalleService;
import com.sutran.client.util.CriteriaManager;

@Service
public class GenTbVehiculodetalleServiceImpl implements GenTbVehiculodetalleService {

	@Autowired
	private GenTbVehiculodetalleMapper genTbVehiculodetalleMapper;
	
	public int save(GenTbVehiculodetalle bean) throws Exception {
		if (bean.getIdVehiDetalle() == null)
			return genTbVehiculodetalleMapper.insert(bean);
		else
			return genTbVehiculodetalleMapper.updateByPrimaryKeySelective(bean);
	}

	public List<GenTbVehiculodetalle> select(CriteriaManager criteriaManager) throws Exception {
		return genTbVehiculodetalleMapper.selectByExample(criteriaManager);
	}

	public GenTbVehiculodetalle selectByPrimaryKey(Integer primaryKey) throws Exception {
		return genTbVehiculodetalleMapper.selectByPrimaryKey(primaryKey);
	}

}
