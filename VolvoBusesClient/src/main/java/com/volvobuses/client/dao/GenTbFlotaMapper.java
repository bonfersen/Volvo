package com.volvobuses.client.dao;

import java.util.List;

import com.volvobuses.client.bean.GenTbFlota;
import com.volvobuses.client.util.CriteriaManager;

public interface GenTbFlotaMapper {
    int deleteByPrimaryKey(Integer idFlota);

    int insert(GenTbFlota record);

    int insertSelective(GenTbFlota record);

    List<GenTbFlota> selectByExample(CriteriaManager example);

    GenTbFlota selectByPrimaryKey(Integer idFlota);

    int updateByPrimaryKeySelective(GenTbFlota record);

    int updateByPrimaryKey(GenTbFlota record);
}