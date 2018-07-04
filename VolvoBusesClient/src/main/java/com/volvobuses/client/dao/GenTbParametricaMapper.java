package com.volvobuses.client.dao;

import java.util.List;

import com.volvobuses.client.bean.GenTbParametrica;
import com.volvobuses.client.util.CriteriaManager;

public interface GenTbParametricaMapper {
    int deleteByPrimaryKey(String paraId);

    int insert(GenTbParametrica record);

    int insertSelective(GenTbParametrica record);

    List<GenTbParametrica> selectByExample(CriteriaManager example);

    GenTbParametrica selectByPrimaryKey(String paraId);

    int updateByPrimaryKeySelective(GenTbParametrica record);

    int updateByPrimaryKey(GenTbParametrica record);
}