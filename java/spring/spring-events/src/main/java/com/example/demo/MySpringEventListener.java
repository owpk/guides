package com.example.demo;

import org.springframework.context.event.*;

public class MySpringEventListener {

    @EventListener
    public void handleContextRefreshed(ContextRefreshedEvent event) {
        System.out.println("context refreshed event received: " + event);
    }

    @EventListener
    public void handleContextStarted(ContextStartedEvent event) {
        System.out.println("context started event received: " + event);
    }

    @EventListener
    public void handleContextStopped(ContextStoppedEvent event) {
        System.out.println("context stopped event received: " + event);
    }

    @EventListener
    public void handleContextClosed(ContextClosedEvent event) {
        System.out.println("context closed event received: " + event);
    }
}
