package com.example.ecommerce.repository;

import com.example.ecommerce.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by adam on 2022. 01. 04.
 */
public interface ProductRepo extends JpaRepository<Product, Long> {
}
