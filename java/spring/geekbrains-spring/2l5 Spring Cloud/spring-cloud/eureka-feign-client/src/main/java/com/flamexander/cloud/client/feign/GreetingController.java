package com.flamexander.cloud.client.feign;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
public class GreetingController {
    private final GreetingClient greetingClient;

    @RequestMapping("/get-greeting")
    public String greeting(Model model) {
        String answer = greetingClient.greeting();
//        answer = greetingClient.parametrized("1000");
        model.addAttribute("greeting", answer);
        return "greeting-view";
    }
}
