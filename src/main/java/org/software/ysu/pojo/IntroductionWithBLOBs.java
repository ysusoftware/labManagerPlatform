package org.software.ysu.pojo;

public class IntroductionWithBLOBs extends Introduction {
    private String introDes;

    private String introBody;

    private String introReldes;

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

    @Override
    public String toString() {
        return "IntroductionWithBLOBs{" +
                "introDes='" + introDes + '\'' +
                ", introBody='" + introBody + '\'' +
                ", introReldes='" + introReldes + '\'' +
                '}';
    }
}