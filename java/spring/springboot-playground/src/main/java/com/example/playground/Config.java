package com.example.playground;

import org.springframework.cache.CacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Vorobyev Vyacheslav
 */
@Configuration
public class Config {

    @Bean(name = "cachez")
    public CacheManager myCacheManager() {
        return new MyCacheManager();
    }
}
