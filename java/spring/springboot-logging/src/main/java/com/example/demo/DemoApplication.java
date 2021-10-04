package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication extends SpringBootServletInitializer implements CommandLineRunner {
    Logger log = LoggerFactory.getLogger(getClass());

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(DemoApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        log.debug("DE ABOBA");
        log.error("ER ABOBA");
        log.warn("WA ABOBA");
        log.info("IN ABOBA");
    }

    @GetMapping
    public String aboba() {
        log.debug("DE ABOBA");
        log.error("ER ABOBA");
        log.warn("WA ABOBA");
        log.info("IN ABOBA");
        return "ABOBA";
    }
}
