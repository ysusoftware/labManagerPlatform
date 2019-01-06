package org.software.ysu.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.software.ysu.pojo.Datum;
import org.software.ysu.pojo.DatumExample;

public interface DatumMapper {
    long countByExample(DatumExample example);

    int deleteByExample(DatumExample example);

    int deleteByPrimaryKey(Integer datumId);

    int insert(Datum record);

    int insertSelective(Datum record);

    List<Datum> selectByExample(DatumExample example);

    Datum selectByPrimaryKey(Integer datumId);

    int updateByExampleSelective(@Param("record") Datum record, @Param("example") DatumExample example);

    int updateByExample(@Param("record") Datum record, @Param("example") DatumExample example);

    int updateByPrimaryKeySelective(Datum record);

    int updateByPrimaryKey(Datum record);
}