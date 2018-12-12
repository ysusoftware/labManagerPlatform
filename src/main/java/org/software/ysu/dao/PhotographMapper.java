package org.software.ysu.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.software.ysu.pojo.Photograph;
import org.software.ysu.pojo.PhotographExample;

public interface PhotographMapper {
    long countByExample(PhotographExample example);

    int deleteByExample(PhotographExample example);

    int deleteByPrimaryKey(Integer photoId);

    int insert(Photograph record);

    int insertSelective(Photograph record);

    List<Photograph> selectByExampleWithBLOBs(PhotographExample example);

    List<Photograph> selectByExample(PhotographExample example);

    Photograph selectByPrimaryKey(Integer photoId);

    int updateByExampleSelective(@Param("record") Photograph record, @Param("example") PhotographExample example);

    int updateByExampleWithBLOBs(@Param("record") Photograph record, @Param("example") PhotographExample example);

    int updateByExample(@Param("record") Photograph record, @Param("example") PhotographExample example);

    int updateByPrimaryKeySelective(Photograph record);

    int updateByPrimaryKeyWithBLOBs(Photograph record);

    int updateByPrimaryKey(Photograph record);
}