package org.software.ysu.service.achievements;

import org.software.ysu.dao.TeamMapper;
import org.software.ysu.pojo.TeamExample;
import org.software.ysu.pojo.TeamWithBLOBs;
import org.software.ysu.service.Interface.ITeamService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TeamServiceImpl implements ITeamService {
    @Resource
    TeamMapper teamMapper;
    @Override
    public int addTeam(TeamWithBLOBs team) {
        return teamMapper.insertSelective(team);
    }

    @Override
    public int delTeam(TeamExample teamExample) {
        return teamMapper.deleteByExample(teamExample);
    }

    @Override
    public int updateTeam(TeamWithBLOBs team) {
        return teamMapper.updateByPrimaryKeySelective(team);
    }

    @Override
    public List<TeamWithBLOBs> getTeam(TeamExample teamExample) {
        return teamMapper.selectByExampleWithBLOBs(teamExample);
    }
}
