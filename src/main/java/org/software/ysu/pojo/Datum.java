package org.software.ysu.pojo;

import java.util.Date;

public class Datum {
    private Integer datumId;

    private String datumOldname;

    private String datumNewname;

    private Date datumLastdate;

    private String datumUser;

    private Integer subjectId;

    private String subjectName;

    public Integer getDatumId() {
        return datumId;
    }

    public void setDatumId(Integer datumId) {
        this.datumId = datumId;
    }

    public String getDatumOldname() {
        return datumOldname;
    }

    public void setDatumOldname(String datumOldname) {
        this.datumOldname = datumOldname == null ? null : datumOldname.trim();
    }

    public String getDatumNewname() {
        return datumNewname;
    }

    public void setDatumNewname(String datumNewname) {
        this.datumNewname = datumNewname == null ? null : datumNewname.trim();
    }

    public Date getDatumLastdate() {
        return datumLastdate;
    }

    public void setDatumLastdate(Date datumLastdate) {
        this.datumLastdate = datumLastdate;
    }

    public String getDatumUser() {
        return datumUser;
    }

    public void setDatumUser(String datumUser) {
        this.datumUser = datumUser == null ? null : datumUser.trim();
    }

    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName == null ? null : subjectName.trim();
    }
}