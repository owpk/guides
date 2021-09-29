package com.owpk.repositories;

import com.owpk.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

  @Query("select a from Customer a where a.name = :name")
  Customer findCustomerByName(@Param("name") String name);

}
