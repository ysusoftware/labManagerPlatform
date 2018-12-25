package org.software.ysu.pojo;

public class IntroductionWithBLOBs extends Introduction {
    private String introDes;

    private String introBody;

    private String introReldes;

    private String introDocument;

    public String getIntroDes() {
        return introDes;
    }

    public void setIntroDes(String introDes) {
        this.introDes = introDes == null ? null : introDes.trim();
    }

    public String getIntroBody() {
        return introBody;
    }

    public void setIntroBody(String introBody) {
        this.introBody = introBody == null ? null : introBody.trim();
    }

    public String getIntroReldes() {
        return introReldes;
    }

    public void setIntroReldes(String introReldes) {
        this.introReldes = introReldes == null ? null : introReldes.trim();
    }

    public String getIntroDocument() {
        return introDocument;
    }

    public void setIntroDocument(String introDocument) {
        this.introDocument = introDocument == null ? null : introDocument.trim();
    }
}