package com.rpicloud.models;

import org.springframework.http.HttpStatus;

/**
 * Created by mixmox on 09/02/16.
 */
public class ErrorMessage {
    private String message;
    private String stackTrace;
    private String timestamp;

    private int errorCode;

    public ErrorMessage(String message, String stackTrace, int errorCode) {
        this.message = message;
        this.stackTrace = stackTrace;
        this.errorCode = errorCode;
    }

    public ErrorMessage() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getStackTrace() {
        return stackTrace;
    }

    public void setStackTrace(String stackTrace) {
        this.stackTrace = stackTrace;
    }
}
