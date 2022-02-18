package com.example.playground;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@SpringBootApplication
@EnableCaching
public class PlaygroundApplication implements CommandLineRunner {
    private static final ObjectMapper objectMapper = new ObjectMapper();
    static {
        objectMapper.disable(SerializationFeature.FAIL_ON_EMPTY_BEANS);
    }

    private CacheManager cacheManager;
    private Service service;


    public static void main(String[] args) throws Exception {
//        SpringApplication.run(PlaygroundApplication.class, args);
        PlaygroundApplication p = new PlaygroundApplication();
        p.run(args);
    }

    @Override
    public void run(String... args) throws Exception {
        DataR<Empty> s = new DataR<>();
        s.setData(new Empty());

        String a = objectMapper.writeValueAsString(s);
        System.out.println(a);
    }

    @Autowired
    public void setCacheManager(CacheManager cacheManager) {
        this.cacheManager = cacheManager;
    }

    @Autowired
    public void setService(Service service) {
        this.service = service;
    }


}