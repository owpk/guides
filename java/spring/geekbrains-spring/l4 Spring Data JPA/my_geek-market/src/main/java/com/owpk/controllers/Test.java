package com.owpk.controllers;

import com.owpk.entities.Customer;
import com.owpk.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Test {

  private OrderService orderService;

  @RequestMapping("/getAll")
  @ResponseBody
  private Customer getAll(String name) {
    return orderService.getCustomerByName(name);
  }

  @Autowired
  public void setOrderService(OrderService orderService) {
    this.orderService = orderService;
  }
}
