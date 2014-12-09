package com.springapp.mvc;

import java.util.List;

/**
 * Created by alobunets on 12/9/2014.
 */
public class Post extends Record{
    private String title;
    private List<Comment> comments; // comments list
    private List<Attachment> attachments;
//    List<Object> objects;

    Post(){
        setCurrentDate();
    }


    public List<Attachment> getAttachments() {
        return attachments;
    }

    public void addAttachment(List<Attachment> attachments) {
        this.attachments = attachments;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
