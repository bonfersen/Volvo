package com.sutran.client.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sutran.client.bean.GenTbHorometro;
import com.sutran.client.dao.GenTbHorometroMapper;
import com.sutran.client.service.GenTbHorometroService;
import com.sutran.client.util.CriteriaManager;

@Service
public class GenTbHorometroServiceImpl implements GenTbHorometroService {

	@Autowired
	private GenTbHorometroMapper genTbHorometroMapper;
	
	public int save(GenTbHorometro bean) throws Exception {
		if (bean.getIdHorometro() == null)
			return genTbHorometroMapper.insert(bean);
		else
			return genTbHorometroMapper.updateByPrimaryKeySelective(bean);
	}

	public List<GenTbHorometro> select(CriteriaManager criteriaManager) throws Exception {
		return genTbHorometroMapper.selectByExample(criteriaManager);
	}

	public GenTbHorometro selectByPrimaryKey(Integer primaryKey) throws Exception {
		return genTbHorometroMapper.selectByPrimaryKey(primaryKey);
	}

}
