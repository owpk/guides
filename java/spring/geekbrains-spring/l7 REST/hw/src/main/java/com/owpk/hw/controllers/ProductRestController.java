package com.owpk.hw.controllers;

import com.owpk.hw.dto.ProdDTO;
import com.owpk.hw.entities.Product;
import com.owpk.hw.services.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/products")
@AllArgsConstructor
public class ProductRestController {
  private ProductService productService;

  @GetMapping
  public Page<Product> getAllProds(@RequestParam(defaultValue = "1", name = "p") Integer page,
                                   @RequestParam Map<String, String> params) {
    return productService.findAll(params, PageRequest.of(page - 1, 5));
  }

}
