package com.springapp.mvc;

import java.util.Date;

/**
 * Created by alobunets on 12/9/2014.
 */
public class Post {
    private String title;
    private String body;
    private String username;
    private String postDate;

    Post(){
        Date date = new Date();
        this.postDate = date.toString();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }


    public String getPostDate() {
        return postDate;
    }

//    public void setPostDate() {
//        Date date = new Date();
//        this.postDate = date.toString();
//    }
}
