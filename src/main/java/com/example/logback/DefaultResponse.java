package com.example.logback;

import lombok.Getter;

@Getter
public abstract class DefaultResponse {

    protected int status;
    protected String message;

    public DefaultResponse(int status, String message) {
        this.status = status;
        this.message = message;
    }
}
