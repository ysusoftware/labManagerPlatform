package org.software.ysu.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.software.ysu.pojo.Introduction;
import org.software.ysu.pojo.IntroductionExample;
import org.software.ysu.pojo.IntroductionWithBLOBs;

public interface IntroductionMapper {
    long countByExample(IntroductionExample example);

    int deleteByExample(IntroductionExample example);

    int deleteByPrimaryKey(Integer introId);

    int insert(IntroductionWithBLOBs record);

    int insertSelective(IntroductionWithBLOBs record);

    List<IntroductionWithBLOBs> selectByExampleWithBLOBs(IntroductionExample example);

    List<Introduction> selectByExample(IntroductionExample example);

    IntroductionWithBLOBs selectByPrimaryKey(Integer introId);

    int updateByExampleSelective(@Param("record") IntroductionWithBLOBs record, @Param("example") IntroductionExample example);

    int updateByExampleWithBLOBs(@Param("record") IntroductionWithBLOBs record, @Param("example") IntroductionExample example);

    int updateByExample(@Param("record") Introduction record, @Param("example") IntroductionExample example);

    int updateByPrimaryKeySelective(IntroductionWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(IntroductionWithBLOBs record);

    int updateByPrimaryKey(Introduction record);
}