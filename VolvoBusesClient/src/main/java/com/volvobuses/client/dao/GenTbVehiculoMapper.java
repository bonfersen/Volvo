package com.volvobuses.client.dao;

import java.util.List;

import com.volvobuses.client.bean.GenTbVehiculo;
import com.volvobuses.client.util.CriteriaManager;

public interface GenTbVehiculoMapper {
    int deleteByPrimaryKey(Integer idVehiculo);

    int insert(GenTbVehiculo record);

    int insertSelective(GenTbVehiculo record);

    List<GenTbVehiculo> selectByExample(CriteriaManager example);

    GenTbVehiculo selectByPrimaryKey(Integer idVehiculo);

    int updateByPrimaryKeySelective(GenTbVehiculo record);

    int updateByPrimaryKey(GenTbVehiculo record);
}