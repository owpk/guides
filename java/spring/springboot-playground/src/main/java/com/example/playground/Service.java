package com.example.playground;

import org.springframework.cache.annotation.Cacheable;

import java.util.List;

/**
 * @author Vorobyev Vyacheslav
 */
@org.springframework.stereotype.Service
public class Service {

    @Cacheable(value = "myCache", cacheManager = "cachez")
    public List<String> cacheList() {
        System.out.println("Getting list...");
        return List.of("A", "B", "C");
    }
}
