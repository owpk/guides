package com.example.playground;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.support.DefaultSingletonBeanRegistry;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.StaticApplicationContext;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

@SpringBootApplication
@RequiredArgsConstructor
public class PlaygroundApplication implements CommandLineRunner {

    Set<String> a = ConcurrentHashMap.newKeySet();

    public static void main(String[] args) {
        SpringApplication.run(PlaygroundApplication.class, args);
    }

    @Override
    public void run(String... args) {
        a.add("asd");
        System.out.println(a);
        System.out.println(a.contains("asd"));
        a.remove("asd");
        System.out.println(a);
    }

}