package org.software.ysu.controller;

import org.software.ysu.pojo.TeamExample;
import org.software.ysu.pojo.TeamWithBLOBs;
import org.software.ysu.pojo.layuiResponse;
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
    public layuiResponse getTeam(){
        TeamExample teamExample = new TeamExample();
        teamExample.createCriteria().andTeamIdEqualTo(2);
        List<TeamWithBLOBs> teams = teamService.getTeam(teamExample);
        layuiResponse layuiResponse = new layuiResponse("0","",teams);
        return layuiResponse;
    }

    @RequestMapping("addTeam.do")
    public String addTeam(TeamWithBLOBs team){
//        team.setTeamAim("ok");
//        team.setTeamPhone("ok");
//        team.setTeamLocation("ok");
//        team.setTeamMemberdes("ok");
//        team.setTeamDes("ok");
//        team.setTeamName("ok");
//        team.setTeamEmail("ok");
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
    public String updateTeam(TeamWithBLOBs team){
        teamService.updateTeam(team);
        return "redirect:getTeam.do";
    }
}
