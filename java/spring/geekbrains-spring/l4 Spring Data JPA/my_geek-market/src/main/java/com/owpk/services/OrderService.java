package com.owpk.services;

import com.owpk.entities.Customer;
import com.owpk.repositories.CustomerRepository;
import com.owpk.repositories.OrderRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class OrderService {
  private OrderRepository orderRepository;
  private CustomerRepository customerRepository;

  public Customer getCustomerByName(String name) {
    return customerRepository.findCustomerByName(name);
  }
}
