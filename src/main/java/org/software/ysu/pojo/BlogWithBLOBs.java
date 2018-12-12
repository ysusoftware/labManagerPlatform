package org.software.ysu.pojo;

public class BlogWithBLOBs extends Blog {
    private String blogDes;

    private String blogBody;

    public String getBlogDes() {
        return blogDes;
    }

    public void setBlogDes(String blogDes) {
        this.blogDes = blogDes == null ? null : blogDes.trim();
    }

    public String getBlogBody() {
        return blogBody;
    }

    public void setBlogBody(String blogBody) {
        this.blogBody = blogBody == null ? null : blogBody.trim();
    }
}