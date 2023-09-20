package com.example.retrofit_image_get;

public class responsemodel {
    String url,title;
    int user,id;

    public responsemodel() {
    }

    public responsemodel(String url, String title, int user, int id) {
        this.url = url;
        this.title = title;
        this.user = user;
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getUser() {
        return user;
    }

    public void setUser(int user) {
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
