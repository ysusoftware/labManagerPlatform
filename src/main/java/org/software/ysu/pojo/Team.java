package org.software.ysu.pojo;

public class Team {
    private Integer teamId;

    private String teamName;

    private String teamAim;

    private String teamLocation;

    private String teamPhone;

    private String teamEmail;

    public Integer getTeamId() {
        return teamId;
    }

    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName == null ? null : teamName.trim();
    }

    public String getTeamAim() {
        return teamAim;
    }

    public void setTeamAim(String teamAim) {
        this.teamAim = teamAim == null ? null : teamAim.trim();
    }

    public String getTeamLocation() {
        return teamLocation;
    }

    public void setTeamLocation(String teamLocation) {
        this.teamLocation = teamLocation == null ? null : teamLocation.trim();
    }

    public String getTeamPhone() {
        return teamPhone;
    }

    public void setTeamPhone(String teamPhone) {
        this.teamPhone = teamPhone == null ? null : teamPhone.trim();
    }

    public String getTeamEmail() {
        return teamEmail;
    }

    public void setTeamEmail(String teamEmail) {
        this.teamEmail = teamEmail == null ? null : teamEmail.trim();
    }

    @Override
    public String toString() {
        return "Team{" +
                "teamId=" + teamId +
                ", teamName='" + teamName + '\'' +
                ", teamAim='" + teamAim + '\'' +
                ", teamLocation='" + teamLocation + '\'' +
                ", teamPhone='" + teamPhone + '\'' +
                ", teamEmail='" + teamEmail + '\'' +
                '}';
    }
}