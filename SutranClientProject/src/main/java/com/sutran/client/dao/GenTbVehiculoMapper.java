package com.sutran.client.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.sutran.client.bean.GenTbVehiculo;
import com.sutran.client.util.CriteriaManager;

@Repository
public interface GenTbVehiculoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GenTbVehiculo record);

    int insertSelective(GenTbVehiculo record);

    List<GenTbVehiculo> selectByExample(CriteriaManager criteriaManager);

    GenTbVehiculo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GenTbVehiculo record);

    int updateByPrimaryKey(GenTbVehiculo record);
}