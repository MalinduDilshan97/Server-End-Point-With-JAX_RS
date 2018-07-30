package com.arimac.SwaggerHub.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ErrorClass {

    private int code;
    private String message;

    public ErrorClass() {
    }

    public ErrorClass(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
