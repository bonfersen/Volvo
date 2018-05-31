package com.sutran.client.service;

import java.util.List;
import com.sutran.client.util.CriteriaManager;

public interface ServiceTemplate<B, P> {

	public int save(B bean) throws Exception;
	
	public List<B> select(CriteriaManager criteriaManager) throws Exception;
	
	public B selectByPrimaryKey(P primaryKey) throws Exception;
}
