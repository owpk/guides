package com.owpk.my_thymeleaf.controllers;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import com.owpk.my_thymeleaf.services.ProductService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.AllArgsConstructor;

@Controller
@RequestMapping("/prod")
@AllArgsConstructor
public class Main {

   private ProductService productService;

   @GetMapping
   public String get(Model model) {
      model.addAttribute("prods", productService.getAll());
      DateFormat dt = new SimpleDateFormat("MM yyyy dd", Locale.ENGLISH);
      model.addAttribute("serverTime", dt.format(new Date()));
      return "prod";
   }
   
}
