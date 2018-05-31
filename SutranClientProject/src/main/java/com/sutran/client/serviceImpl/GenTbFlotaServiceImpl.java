package com.sutran.client.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sutran.client.bean.GenTbFlota;
import com.sutran.client.dao.GenTbFlotaMapper;
import com.sutran.client.service.GenTbFlotaService;
import com.sutran.client.util.CriteriaManager;

@Service
public class GenTbFlotaServiceImpl implements GenTbFlotaService {

	@Autowired
	private GenTbFlotaMapper genTbFlotaMapper;

	public int save(GenTbFlota bean) throws Exception {
		if (bean.getIdFlota() == null)
			return genTbFlotaMapper.insert(bean);
		else
			return genTbFlotaMapper.updateByPrimaryKeySelective(bean);
	}

	public List<GenTbFlota> select(CriteriaManager criteriaManager) throws Exception {
		return genTbFlotaMapper.selectByExample(criteriaManager);
	}

	public GenTbFlota selectByPrimaryKey(Integer primaryKey) throws Exception {
		return genTbFlotaMapper.selectByPrimaryKey(primaryKey);
	}

}
