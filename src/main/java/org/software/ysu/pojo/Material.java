package org.software.ysu.pojo;

public class Material extends Page{


    private Integer materialId;

    private String materialName;

    private String materialUrl;

    private Integer assortId;

    private String materialDes;

    private String assortName;

    private String keyWord;

    public String getAssortName() {
        return assortName;
    }

    public void setAssortName(String assortName) {
        this.assortName = assortName;
    }

    public String getKeyWord() {
        return keyWord;
    }

    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord;
    }

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

    @Override
    public String toString() {
        return "Material{" +
                "materialId=" + materialId +
                ", materialName='" + materialName + '\'' +
                ", materialUrl='" + materialUrl + '\'' +
                ", assortId=" + assortId +
                ", materialDes='" + materialDes + '\'' +
                ", keyWord='" + keyWord + '\'' +
                '}';
    }
}