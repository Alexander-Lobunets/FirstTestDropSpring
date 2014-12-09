package com.springapp.mvc;

/**
 * Created by alobunets on 12/9/2014.
 */

import java.util.Date;

public abstract class Record {

    String body;
    String recordDate;
    String username;
    public Object attachments;

    public String getBody() {
        return body;
    }
    public void setBody(String body) {
        this.body = body;
    }
    public void setCurrentDate() {
        Date date = new Date();
        recordDate = date.toString();
    }
    public String getRecordDate() {
        return recordDate;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
}
