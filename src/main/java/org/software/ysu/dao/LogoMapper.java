package org.software.ysu.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.software.ysu.pojo.Logo;
import org.software.ysu.pojo.LogoExample;

public interface LogoMapper {
    long countByExample(LogoExample example);

    int deleteByExample(LogoExample example);

    int deleteByPrimaryKey(Integer logoId);

    int insert(Logo record);

    int insertSelective(Logo record);

    List<Logo> selectByExample(LogoExample example);

    Logo selectByPrimaryKey(Integer logoId);

    int updateByExampleSelective(@Param("record") Logo record, @Param("example") LogoExample example);

    int updateByExample(@Param("record") Logo record, @Param("example") LogoExample example);

    int updateByPrimaryKeySelective(Logo record);

    int updateByPrimaryKey(Logo record);
}