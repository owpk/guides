package com.owpk.hw.controllers;

import com.owpk.hw.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/prod")
@AllArgsConstructor
public class Main {

  private ProductService productService;

  @GetMapping
  public String get(Model model,
                    @RequestParam(defaultValue = "1", name = "page") Integer page,
                    @RequestParam(required = false, defaultValue = "0", name = "min") Integer min,
                    @RequestParam(required = false, name = "max") Integer max) {
    if (max == null)
    model.addAttribute
        ("products",
            productService.getProductsByMinPrice(min, page - 1, 5));
    else model.addAttribute("products",
        productService.getProductsByMinAndMaxPrice(min, max, page -1, 5));
    return "prod";
  }

}
