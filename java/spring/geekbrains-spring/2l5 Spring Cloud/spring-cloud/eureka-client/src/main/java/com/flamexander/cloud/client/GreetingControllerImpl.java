package com.flamexander.cloud.client;

import com.netflix.discovery.EurekaClient;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class GreetingControllerImpl implements GreetingController {
    private final EurekaClient eurekaClient;

    @Value("${spring.application.name}")
    private String appName;

//    @Value("${userValue}")
//    private String username;

    @Override
    @GetMapping("/greeting")
    public String greeting() {
        return String.format("Hello from '%s'!", eurekaClient.getApplication(appName).getName());
    }

    @GetMapping("/abc")
    public void test() {
        System.out.println("_ABC_");
    }

    @GetMapping("/abcr")
    public String abcr() {
        return "ABC";
    }

    @GetMapping("/parametrized/{id}")
    public String parametrized(@PathVariable(value = "id") String id) {
        return "echo: " + id;
    }
}
