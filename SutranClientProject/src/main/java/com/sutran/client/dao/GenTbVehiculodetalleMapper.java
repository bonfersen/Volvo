package com.sutran.client.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.sutran.client.bean.GenTbVehiculodetalle;
import com.sutran.client.util.CriteriaManager;

@Repository
public interface GenTbVehiculodetalleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GenTbVehiculodetalle record);

    int insertSelective(GenTbVehiculodetalle record);

    List<GenTbVehiculodetalle> selectByExample(CriteriaManager criteriaManager);

    GenTbVehiculodetalle selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GenTbVehiculodetalle record);

    int updateByPrimaryKey(GenTbVehiculodetalle record);
}