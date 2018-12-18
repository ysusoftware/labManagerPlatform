package org.software.ysu.pojo;

public class TeamWithBLOBs extends Team {
    private String teamDes;

    private String teamMemberdes;

    public String getTeamDes() {
        return teamDes;
    }

    public void setTeamDes(String teamDes) {
        this.teamDes = teamDes == null ? null : teamDes.trim();
    }

    public String getTeamMemberdes() {
        return teamMemberdes;
    }

    public void setTeamMemberdes(String teamMemberdes) {
        this.teamMemberdes = teamMemberdes == null ? null : teamMemberdes.trim();
    }

    @Override
    public String toString() {
        return "TeamWithBLOBs{" +
                "teamDes='" + teamDes + '\'' +
                ", teamMemberdes='" + teamMemberdes + '\'' +
                '}';
    }
}