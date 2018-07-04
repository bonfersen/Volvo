package com.volvobuses.client.dao;

import java.util.List;

import com.volvobuses.client.bean.GenTbBusesdetalle;
import com.volvobuses.client.util.CriteriaManager;

public interface GenTbBusesdetalleMapper {
    int deleteByPrimaryKey(Integer idBusDetalle);

    int insert(GenTbBusesdetalle record);

    int insertSelective(GenTbBusesdetalle record);

    List<GenTbBusesdetalle> selectByExample(CriteriaManager example);

    GenTbBusesdetalle selectByPrimaryKey(Integer idBusDetalle);

    int updateByPrimaryKeySelective(GenTbBusesdetalle record);

    int updateByPrimaryKey(GenTbBusesdetalle record);
}