package org.software.ysu.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.software.ysu.pojo.Assort;
import org.software.ysu.pojo.AssortExample;

public interface AssortMapper {
    long countByExample(AssortExample example);

    int deleteByExample(AssortExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Assort record);

    int insertSelective(Assort record);

    List<Assort> selectByExample(AssortExample example);

    Assort selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Assort record, @Param("example") AssortExample example);

    int updateByExample(@Param("record") Assort record, @Param("example") AssortExample example);

    int updateByPrimaryKeySelective(Assort record);

    int updateByPrimaryKey(Assort record);
}