package com.chutien.testgcm.model;

/**
 * Created by ${LTG} on ${10/12/1994}.
 */
public class Message {
    private String message;
    private long timestamp;

    public Message() {
    }

    public Message(String message, long timestamp) {
        this.message = message;
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
}
