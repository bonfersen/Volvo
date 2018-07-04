package com.volvobuses.client.service;

import java.util.List;

import com.volvobuses.client.util.CriteriaManager;

public interface ServiceTemplate<B, P> {

	public int save(B bean) throws Exception;
	
	public List<B> select(CriteriaManager criteriaManager) throws Exception;
	
	public B selectByPrimaryKey(P primaryKey) throws Exception;
}
