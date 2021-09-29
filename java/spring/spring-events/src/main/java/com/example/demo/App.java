package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App implements ApplicationRunner {

    @Autowired
    private MyEventPublisher publisher;

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(App.class);
        app.run(args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("MSG SENT:" + "ABOBA");
        publisher.publishCustomEvent("ABOBA");
        publisher.publishCustomEvent("A");
    }
}
