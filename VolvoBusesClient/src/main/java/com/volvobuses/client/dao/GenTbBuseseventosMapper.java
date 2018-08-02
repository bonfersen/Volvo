package com.volvobuses.client.dao;

import java.util.List;

import com.volvobuses.client.bean.GenTbBuseseventos;
import com.volvobuses.client.util.CriteriaManager;

public interface GenTbBuseseventosMapper {
    int deleteByPrimaryKey(Integer idBusEvento);

    int insert(GenTbBuseseventos record);

    int insertSelective(GenTbBuseseventos record);

    List<GenTbBuseseventos> selectByExample(CriteriaManager example);

    GenTbBuseseventos selectByPrimaryKey(Integer idBusEvento);

    int updateByPrimaryKeySelective(GenTbBuseseventos record);

    int updateByPrimaryKey(GenTbBuseseventos record);
}