package com.healthcare.thymeleafdemo.exceptions;

public class MyResponseErrorMessage {

    private String method;
    private String message;

    public MyResponseErrorMessage() {}

    public MyResponseErrorMessage(String method, String message) {
        this.method = method;
        this.message = message;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
