package com.geekbrains.geek.market.repositories;

import com.geekbrains.geek.market.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

    @Query("SELECT o FROM Order o WHERE o.customer.id = ?1")
    List<Order> findAllByCustomerId(Long customerId);
}
