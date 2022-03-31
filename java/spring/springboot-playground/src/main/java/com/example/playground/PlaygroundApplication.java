package com.example.playground;

import com.example.playground.beans.SecondBean;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.GenericApplicationContext;

@SpringBootApplication
@RequiredArgsConstructor
public class PlaygroundApplication implements CommandLineRunner {

    private static final ObjectMapper objectMapper = new ObjectMapper();

    private final GenericApplicationContext ctx;

    static {
        objectMapper.disable(SerializationFeature.FAIL_ON_EMPTY_BEANS);
    }

    public static void main(String[] args) {
        SpringApplication.run(PlaygroundApplication.class, args);
    }

    @Override
    public void run(String... args) {
        var bean = ctx.getBean(SecondBean.class);
        bean.foo();
    }

}