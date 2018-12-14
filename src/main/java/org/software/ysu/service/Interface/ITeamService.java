package org.software.ysu.service.Interface;

import org.software.ysu.pojo.TeamExample;
import org.software.ysu.pojo.TeamWithBLOBs;

import java.util.List;

public interface ITeamService {
    public int addTeam(TeamWithBLOBs team);
    public int delTeam(TeamExample teamExample);
    public int updateTeam(TeamWithBLOBs team);
    List<TeamWithBLOBs> getTeam(TeamExample teamExample);
}
