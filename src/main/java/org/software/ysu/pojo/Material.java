package org.software.ysu.pojo;

public class Material {
    private Integer materialId;

    private String materialName;

    private String materialUrl;

    private Integer assortId;

    private String materialDes;

    public Integer getMaterialId() {
        return materialId;
    }

    public void setMaterialId(Integer materialId) {
        this.materialId = materialId;
    }

    public String getMaterialName() {
        return materialName;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName == null ? null : materialName.trim();
    }

    public String getMaterialUrl() {
        return materialUrl;
    }

    public void setMaterialUrl(String materialUrl) {
        this.materialUrl = materialUrl == null ? null : materialUrl.trim();
    }

    public Integer getAssortId() {
        return assortId;
    }

    public void setAssortId(Integer assortId) {
        this.assortId = assortId;
    }

    public String getMaterialDes() {
        return materialDes;
    }

    public void setMaterialDes(String materialDes) {
        this.materialDes = materialDes == null ? null : materialDes.trim();
    }
}