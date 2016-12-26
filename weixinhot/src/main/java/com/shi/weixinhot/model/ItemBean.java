package com.shi.weixinhot.model;

/**
 * Created by shimanqiang on 16/12/26.
 */

public class ItemBean {
    private int type; //0:轮播图 banner ; 1:普通条目
    private String title;//标题
    private String url;//链接地址
    private String imgUrl; //图片地址

    /**
     * 下面的普通条目拥有属性
     */
    private String readCount;//已经阅读的数目
    private String author;//发布的作者
    private String aboutTime;//大约发布的时间

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getReadCount() {
        return readCount;
    }

    public void setReadCount(String readCount) {
        this.readCount = readCount;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAboutTime() {
        return aboutTime;
    }

    public void setAboutTime(String aboutTime) {
        this.aboutTime = aboutTime;
    }
}
