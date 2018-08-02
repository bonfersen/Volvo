package com.volvobuses.client.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.volvobuses.client.bean.GenTbBuseseventos;
import com.volvobuses.client.dao.GenTbBuseseventosMapper;
import com.volvobuses.client.service.GenTbBusesEventoService;
import com.volvobuses.client.util.CriteriaManager;

@Service
public class GenTbBusesEventoServiceImpl implements GenTbBusesEventoService {
	
	@Autowired
	GenTbBuseseventosMapper genTbBuseseventoMapper;

	@Override
	public int save(GenTbBuseseventos bean) throws Exception {
		if (bean.getIdBusEvento() == null)
			return genTbBuseseventoMapper.insert(bean);
		else
			return genTbBuseseventoMapper.updateByPrimaryKeySelective(bean);
	}

	@Override
	public List<GenTbBuseseventos> select(CriteriaManager criteriaManager) throws Exception {
		return genTbBuseseventoMapper.selectByExample(criteriaManager);
	}

	@Override
	public GenTbBuseseventos selectByPrimaryKey(Integer primaryKey) throws Exception {
		return genTbBuseseventoMapper.selectByPrimaryKey(primaryKey);
	}

}
