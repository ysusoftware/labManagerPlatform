package org.software.ysu.pojo;

import java.util.Date;

public class Blog {
    private Integer blogId;

    private String blogName;

    private Integer userId;

    private String userName;

    private Integer categoryId;

    private String categoryName;

    private Integer blogHidden;

    private Date blogCreatetime;

    private Date blogUpdatetime;

    private String blogPicdefault;

    private String blogPicbig;

    public Integer getBlogId() {
        return blogId;
    }

    public void setBlogId(Integer blogId) {
        this.blogId = blogId;
    }

    public String getBlogName() {
        return blogName;
    }

    public void setBlogName(String blogName) {
        this.blogName = blogName == null ? null : blogName.trim();
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

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName == null ? null : categoryName.trim();
    }

    public Integer getBlogHidden() {
        return blogHidden;
    }

    public void setBlogHidden(Integer blogHidden) {
        this.blogHidden = blogHidden;
    }

    public Date getBlogCreatetime() {
        return blogCreatetime;
    }

    public void setBlogCreatetime(Date blogCreatetime) {
        this.blogCreatetime = blogCreatetime;
    }

    public Date getBlogUpdatetime() {
        return blogUpdatetime;
    }

    public void setBlogUpdatetime(Date blogUpdatetime) {
        this.blogUpdatetime = blogUpdatetime;
    }

    public String getBlogPicdefault() {
        return blogPicdefault;
    }

    public void setBlogPicdefault(String blogPicdefault) {
        this.blogPicdefault = blogPicdefault == null ? null : blogPicdefault.trim();
    }

    public String getBlogPicbig() {
        return blogPicbig;
    }

    public void setBlogPicbig(String blogPicbig) {
        this.blogPicbig = blogPicbig == null ? null : blogPicbig.trim();
    }
}