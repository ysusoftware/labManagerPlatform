package org.software.ysu.pojo;

import java.util.Date;

public class Introduction {
    private Integer introId;

    private String introTitle;

    private Date introCreatetime;

    private Date introUpdatetime;

    private Integer userId;

    private String userName;

    private String introRelname;

    private Integer subjectId;

    private String introUrl;

    private String introPicdefault;

    private String introPicbig;

    public Integer getIntroId() {
        return introId;
    }

    public void setIntroId(Integer introId) {
        this.introId = introId;
    }

    public String getIntroTitle() {
        return introTitle;
    }

    public void setIntroTitle(String introTitle) {
        this.introTitle = introTitle == null ? null : introTitle.trim();
    }

    public Date getIntroCreatetime() {
        return introCreatetime;
    }

    public void setIntroCreatetime(Date introCreatetime) {
        this.introCreatetime = introCreatetime;
    }

    public Date getIntroUpdatetime() {
        return introUpdatetime;
    }

    public void setIntroUpdatetime(Date introUpdatetime) {
        this.introUpdatetime = introUpdatetime;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getIntroRelname() {
        return introRelname;
    }

    public void setIntroRelname(String introRelname) {
        this.introRelname = introRelname == null ? null : introRelname.trim();
    }

    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    public String getIntroUrl() {
        return introUrl;
    }

    public void setIntroUrl(String introUrl) {
        this.introUrl = introUrl == null ? null : introUrl.trim();
    }

    public String getIntroPicdefault() {
        return introPicdefault;
    }

    public void setIntroPicdefault(String introPicdefault) {
        this.introPicdefault = introPicdefault == null ? null : introPicdefault.trim();
    }

    public String getIntroPicbig() {
        return introPicbig;
    }

    public void setIntroPicbig(String introPicbig) {
        this.introPicbig = introPicbig == null ? null : introPicbig.trim();
    }

    @Override
    public String toString() {
        return "Introduction{" +
                "introId=" + introId +
                ", introTitle='" + introTitle + '\'' +
                ", introCreatetime=" + introCreatetime +
                ", introUpdatetime=" + introUpdatetime +
                ", userId=" + userId +
                ", userName='" + userName + '\'' +
                ", introRelname='" + introRelname + '\'' +
                ", subjectId=" + subjectId +
                ", introUrl='" + introUrl + '\'' +
                ", introPicdefault='" + introPicdefault + '\'' +
                ", introPicbig='" + introPicbig + '\'' +
                '}';
    }
}