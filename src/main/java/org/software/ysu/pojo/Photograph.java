package org.software.ysu.pojo;

public class Photograph {
    private Integer photoId;

    private String photoUrl;

    private Integer subjectId;

    private String photoDes;

    public Integer getPhotoId() {
        return photoId;
    }

    public void setPhotoId(Integer photoId) {
        this.photoId = photoId;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl == null ? null : photoUrl.trim();
    }

    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    public String getPhotoDes() {
        return photoDes;
    }

    public void setPhotoDes(String photoDes) {
        this.photoDes = photoDes == null ? null : photoDes.trim();
    }
}