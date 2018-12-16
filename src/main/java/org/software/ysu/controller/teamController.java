package org.software.ysu.controller;

import org.software.ysu.pojo.Team;
import org.software.ysu.pojo.TeamExample;
import org.software.ysu.pojo.TeamWithBLOBs;
import org.software.ysu.pojo.layuiResponse;
import org.software.ysu.service.Interface.ITeamService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("team")
public class teamController {
    @Resource
    ITeamService teamService;

    @RequestMapping("getTeam.do")
    public Team getTeam(){
        TeamExample teamExample = new TeamExample();
        List<TeamWithBLOBs> teams = teamService.getTeam(teamExample);
//        layuiResponse layuiResponse = new layuiResponse("0","",teams);
        return teams.get(0);
    }

    @RequestMapping("addTeam.do")
    public String addTeam(TeamWithBLOBs team){
        teamService.addTeam(team);
        return "success";
    }

    @RequestMapping("delTeam.do")
    public String delTeam(Integer teamId){
        TeamExample teamExample = new TeamExample();
        teamExample.createCriteria().andTeamIdEqualTo(teamId);
        teamService.delTeam(teamExample);
        return "success";
    }

    @RequestMapping("updateTeam.do")
    public String updateTeam(TeamWithBLOBs teams){
        System.out.println("teams="+teams.toString());
        teamService.updateTeam(teams);
        return "success";
    }
}
