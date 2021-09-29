package com.owpk.hw.repositories;

import com.owpk.hw.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepo extends JpaRepository<Order, Long> {
  List<Order> findAllByCustomerId(Long id);
}
