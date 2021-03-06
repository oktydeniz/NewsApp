package com.oktydeniz.newsapp.data;

import org.jetbrains.annotations.NotNull;

import java.util.Date;

public class NewsItem {

    int id;
    String title;
    String username;
    String newsImg;
    String userImage;
    String content;
    String bgColor;
    Date dateCreation;
    int viewType = 0;
    String videoUrl;
    boolean isFav = false;

    public NewsItem() {
    }

    public NewsItem(int id, String title, String username, String newsImg, String userImage, String content, String bgColor, Date dateCreation, int viewType, String videoUrl, boolean isFav) {
        this.id = id;
        this.title = title;
        this.username = username;
        this.newsImg = newsImg;
        this.userImage = userImage;
        this.content = content;
        this.bgColor = bgColor;
        this.dateCreation = dateCreation;
        this.viewType = viewType;
        this.videoUrl = videoUrl;
        this.isFav = isFav;
    }

    public NewsItem(int id, String title, String username, String newsImg, String userImage, String content, String bgColor, Date dateCreation, int viewType) {
        this.id = id;
        this.title = title;
        this.username = username;
        this.newsImg = newsImg;
        this.userImage = userImage;
        this.content = content;
        this.bgColor = bgColor;
        this.dateCreation = dateCreation;
        this.viewType = viewType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNewsImg() {
        return newsImg;
    }

    public void setNewsImg(String newsImg) {
        this.newsImg = newsImg;
    }

    public String getUserImage() {
        return userImage;
    }

    public void setUserImage(String userImage) {
        this.userImage = userImage;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getBgColor() {
        return bgColor;
    }

    public void setBgColor(String bgColor) {
        this.bgColor = bgColor;
    }


    public int getViewType() {
        return viewType;
    }

    public boolean isFav() {
        return isFav;
    }

    public void setFav(boolean fav) {
        isFav = fav;
    }

    @NotNull
    @Override
    public String toString() {
        return "NewsItem{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", username='" + username + '\'' +
                ", newsImg='" + newsImg + '\'' +
                ", userImage='" + userImage + '\'' +
                ", content='" + content + '\'' +
                ", bgColor='" + bgColor + '\'' +
                ", dateCreation=" + dateCreation +
                ", viewType=" + viewType +
                ", videoUrl='" + videoUrl + '\'' +
                ", isFav=" + isFav +
                '}';
    }
}
