package com.volvobuses.client.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.volvobuses.client.bean.GenTbBusesdetalle;
import com.volvobuses.client.dao.GenTbBusesdetalleMapper;
import com.volvobuses.client.service.GenTbBusesDetalleService;
import com.volvobuses.client.util.CriteriaManager;

@Service
public class GenTbBusesDetalleServiceImpl implements GenTbBusesDetalleService {
	
	@Autowired
	GenTbBusesdetalleMapper genTbBusesdetalleMapper;

	@Override
	public int save(GenTbBusesdetalle bean) throws Exception {
		if (bean.getIdBusDetalle() == null)
			return genTbBusesdetalleMapper.insert(bean);
		else
			return genTbBusesdetalleMapper.updateByPrimaryKeySelective(bean);
	}

	@Override
	public List<GenTbBusesdetalle> select(CriteriaManager criteriaManager) throws Exception {
		return genTbBusesdetalleMapper.selectByExample(criteriaManager);
	}

	@Override
	public GenTbBusesdetalle selectByPrimaryKey(Integer primaryKey) throws Exception {
		return genTbBusesdetalleMapper.selectByPrimaryKey(primaryKey);
	}

}
