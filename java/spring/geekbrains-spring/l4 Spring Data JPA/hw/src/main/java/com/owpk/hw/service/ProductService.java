package com.owpk.hw.service;

import com.owpk.hw.entities.Product;
import com.owpk.hw.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
  private ProductRepository productRepository;

  @Autowired
  public void setProductRepository(ProductRepository productRepository) {
    this.productRepository = productRepository;
  }

  public Page<Product> findAll(Integer page, Integer size) {
    return productRepository.findAll(PageRequest.of(page, size));
  }

  public Page<Product> getProductsByMinPrice(Integer min, Integer page, Integer size) {
    return productRepository.getProductByPriceGreaterThanEqual(min, PageRequest.of(page, size));
  }

  public Page<Product> getProductsByMinAndMaxPrice(Integer min, Integer max, Integer page, Integer size) {
    return productRepository.getProductByPriceGreaterThanEqualAndLessThanEqual(min, max, PageRequest.of(page, size));
  }
}
