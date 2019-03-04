package com.sxillocc.androidchat;

public class Message {
    public String email;
    public String message;

    public Message(){
        //Required
    }

    public Message(String email,String message){
        this.email = email;
        this.message = message;
    }
}
