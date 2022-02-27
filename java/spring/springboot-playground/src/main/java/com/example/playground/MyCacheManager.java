package com.example.playground;

import com.google.common.cache.CacheBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.cache.concurrent.ConcurrentMapCache;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * @author Vorobyev Vyacheslav
 */
public class MyCacheManager extends ConcurrentMapCacheManager {
    @Override
    protected Cache createConcurrentMapCache(String name) {
        return new ConcurrentMapCache(name,
                CacheBuilder.newBuilder()
                        .expireAfterWrite(100, TimeUnit.SECONDS)
                        .maximumSize(100)
                        .build().asMap(),
                true);
    }
}