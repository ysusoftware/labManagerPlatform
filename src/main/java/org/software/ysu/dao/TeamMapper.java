package org.software.ysu.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.software.ysu.pojo.Team;
import org.software.ysu.pojo.TeamExample;
import org.software.ysu.pojo.TeamWithBLOBs;

public interface TeamMapper {
    long countByExample(TeamExample example);

    int deleteByExample(TeamExample example);

    int deleteByPrimaryKey(Integer teamId);

    int insert(TeamWithBLOBs record);

    int insertSelective(TeamWithBLOBs record);

    List<TeamWithBLOBs> selectByExampleWithBLOBs(TeamExample example);

    List<Team> selectByExample(TeamExample example);

    TeamWithBLOBs selectByPrimaryKey(Integer teamId);

    int updateByExampleSelective(@Param("record") TeamWithBLOBs record, @Param("example") TeamExample example);

    int updateByExampleWithBLOBs(@Param("record") TeamWithBLOBs record, @Param("example") TeamExample example);

    int updateByExample(@Param("record") Team record, @Param("example") TeamExample example);

    int updateByPrimaryKeySelective(TeamWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(TeamWithBLOBs record);

    int updateByPrimaryKey(Team record);
}