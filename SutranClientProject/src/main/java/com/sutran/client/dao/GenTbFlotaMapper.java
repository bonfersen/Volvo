package com.sutran.client.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.sutran.client.bean.GenTbFlota;
import com.sutran.client.util.CriteriaManager;

@Repository
public interface GenTbFlotaMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GenTbFlota record);

    int insertSelective(GenTbFlota record);

    List<GenTbFlota> selectByExample(CriteriaManager criteriaManager);

    GenTbFlota selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GenTbFlota record);

    int updateByPrimaryKey(GenTbFlota record);
}