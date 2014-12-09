package com.springapp.mvc;

/**
 * Created by alobunets on 12/9/2014.
 */
public class Comment extends Record{



    Comment(String postdate, String body, String username){
        this.recordDate = postdate;
        this.body = body;
        this.username = username;

    }


}
