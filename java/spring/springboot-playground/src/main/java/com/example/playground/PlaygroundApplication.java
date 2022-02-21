package com.example.playground;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import javax.validation.constraints.Pattern;

public class PlaygroundApplication implements CommandLineRunner {
    private static final ObjectMapper objectMapper = new ObjectMapper();

    static {
        objectMapper.disable(SerializationFeature.FAIL_ON_EMPTY_BEANS);
    }

    public static void main(String[] args) throws Exception {
        PlaygroundApplication p = new PlaygroundApplication();
        p.run(args);
    }

    @Override
    public void run(String... args) throws Exception {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();

        Obj o = new Obj();
        o.a = "aasdA_-";


        var err = validator.validate(o);
        System.out.println(err);

    }

    public static class Obj {
        @Pattern(regexp = "[a-zA-Z\\-_]+")
        String a;
    }

}