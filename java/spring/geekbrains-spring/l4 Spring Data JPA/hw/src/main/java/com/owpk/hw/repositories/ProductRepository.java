package com.owpk.hw.repositories;

import com.owpk.hw.entities.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
  Page<Product> getProductByPriceGreaterThanEqual(Integer price, Pageable var);

  @Query("SELECT p FROM Product p WHERE p.price >= :min AND p.price <= :max")
  Page<Product> getProductByPriceGreaterThanEqualAndLessThanEqual(Integer min, Integer max, Pageable var);
}