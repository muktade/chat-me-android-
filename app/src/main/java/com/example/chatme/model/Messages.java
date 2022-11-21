package com.example.chatme.model;

public class Messages {

    String uId, message, messageId;
    Long timesTamp;

    public Messages(String uId, String message) {
        this.uId = uId;
        this.message = message;
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public Messages() {
    }

    public Messages(String uId, String message, Long timesTamp, String messageId) {
        this.uId = uId;
        this.message = message;
        this.timesTamp = timesTamp;
        this.messageId= messageId;
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Long getTimesTamp() {
        return timesTamp;
    }

    public void setTimesTamp(Long timesTamp) {
        this.timesTamp = timesTamp;
    }
}
