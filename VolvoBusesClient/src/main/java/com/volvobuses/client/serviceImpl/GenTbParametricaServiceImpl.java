package com.volvobuses.client.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.volvobuses.client.bean.GenTbParametrica;
import com.volvobuses.client.dao.GenTbParametricaMapper;
import com.volvobuses.client.service.GenTbParametricaService;
import com.volvobuses.client.util.CriteriaManager;

@Service
public class GenTbParametricaServiceImpl implements GenTbParametricaService {
	
	@Autowired
	private GenTbParametricaMapper genTbParametricaMapper;

	@Override
	public int save(GenTbParametrica bean) throws Exception {
		return 0;
	}

	@Override
	public List<GenTbParametrica> select(CriteriaManager criteriaManager) throws Exception {
		return genTbParametricaMapper.selectByExample(criteriaManager);
	}

	@Override
	public GenTbParametrica selectByPrimaryKey(String primaryKey) throws Exception {
		return genTbParametricaMapper.selectByPrimaryKey(primaryKey);
	}

}
