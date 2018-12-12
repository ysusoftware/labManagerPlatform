package org.software.ysu.pojo;

public class Logo {
    private Integer logoId;

    private String logoDes;

    private String logoPath;

    public Integer getLogoId() {
        return logoId;
    }

    public void setLogoId(Integer logoId) {
        this.logoId = logoId;
    }

    public String getLogoDes() {
        return logoDes;
    }

    public void setLogoDes(String logoDes) {
        this.logoDes = logoDes == null ? null : logoDes.trim();
    }

    public String getLogoPath() {
        return logoPath;
    }

    public void setLogoPath(String logoPath) {
        this.logoPath = logoPath == null ? null : logoPath.trim();
    }
}