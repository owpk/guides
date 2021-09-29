package com.owpk.my_thymeleaf.services;

import java.util.List;

import com.owpk.my_thymeleaf.entities.Product;
import com.owpk.my_thymeleaf.repositories.ProductRepository;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ProductService {
   private ProductRepository productRepository;
   
   public List<Product> getAll() {
      return productRepository.findAll();
   }   
}
