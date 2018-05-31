package com.sutran.client.dao;

import com.sutran.client.bean.GenTbHorometro;
import com.sutran.client.util.CriteriaManager;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public interface GenTbHorometroMapper {
    int deleteByPrimaryKey(Integer idHorometro);

    int insert(GenTbHorometro record);

    int insertSelective(GenTbHorometro record);

    List<GenTbHorometro> selectByExample(CriteriaManager example);

    GenTbHorometro selectByPrimaryKey(Integer idHorometro);

    int updateByPrimaryKeySelective(GenTbHorometro record);

    int updateByPrimaryKey(GenTbHorometro record);
}