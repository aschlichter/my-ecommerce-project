package com.example.ecommerce.repository;

import com.example.ecommerce.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by adam on 2022. 01. 19.
 */
public interface CustomerRepo extends JpaRepository<Customer, Long> {
}
