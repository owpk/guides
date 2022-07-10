package com.example.playground;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Vorobyev Vyacheslav
 */
@Configuration
public class BeanConfig {

    @Bean(name = "myClass")
    public MyClass myClass() {
        return new MyClass("sop");
    }
}
