package com.owpk.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name = "orders")
public class Order {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private Integer current_price;

  @ManyToOne
  @JoinColumn(name = "customer_id")
  private Customer customer;

  @ManyToOne
  @JoinColumn(name = "product_id")
  private Product product;

  @Override
  public String toString() {
    return "Order{" +
        "id=" + id +
        ", current_price=" + current_price +
        ", customer=" + customer +
        ", product=" + product +
        '}';
  }
}
