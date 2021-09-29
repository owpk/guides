package com.example.demo;

import org.springframework.context.ApplicationEvent;

public class CustomEvent extends ApplicationEvent {
    private String msg;

    public CustomEvent(Object source, String msg) {
        super(source);
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }
}
