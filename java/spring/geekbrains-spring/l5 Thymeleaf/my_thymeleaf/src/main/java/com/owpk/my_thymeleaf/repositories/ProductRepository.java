package com.owpk.my_thymeleaf.repositories;

import com.owpk.my_thymeleaf.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
   
}
