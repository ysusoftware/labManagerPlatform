package org.software.ysu.controller;

import org.software.ysu.pojo.TeamExample;
import org.software.ysu.pojo.TeamWithBLOBs;
import org.software.ysu.service.Interface.ITeamService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class teamController {
    @Resource
    ITeamService teamService;

    @RequestMapping("getTeam.do")
    public List<TeamWithBLOBs> getTeam(){
        TeamExample teamExample = new TeamExample();
        teamExample.createCriteria().andTeamIdEqualTo(2);
        List<TeamWithBLOBs> teams = teamService.getTeam(teamExample);
        return teams;
    }

    @RequestMapping("addTeam.do")
    public String addTeam(TeamWithBLOBs team){
        teamService.addTeam(team);
        return "redirect:getTeam.do";
    }

    @RequestMapping("delTeam.do")
    public String delTeam(Integer teamId){
        TeamExample teamExample = new TeamExample();
        teamExample.createCriteria().andTeamIdEqualTo(teamId);
        teamService.delTeam(teamExample);
        return "redirect:getTeam.do";
    }

    @RequestMapping("updateTeam.do")
    public String updateTeam(TeamWithBLOBs team){
        teamService.updateTeam(team);
        return "redirect:getTeam.do";
    }
}
