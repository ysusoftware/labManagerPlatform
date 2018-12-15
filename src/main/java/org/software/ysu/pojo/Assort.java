package org.software.ysu.pojo;

public class Assort {
    private Integer id;

    private String assortName;

    private Integer assortParentid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAssortName() {
        return assortName;
    }

    public void setAssortName(String assortName) {
        this.assortName = assortName == null ? null : assortName.trim();
    }

    public Integer getAssortParentid() {
        return assortParentid;
    }

    public void setAssortParentid(Integer assortParentid) {
        this.assortParentid = assortParentid;
    }
}