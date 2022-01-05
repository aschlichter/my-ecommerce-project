package com.example.ecommerce.repository;

import com.example.ecommerce.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

/**
 * Created by adam on 2022. 01. 04.
 */
@CrossOrigin("http://localhost:4200")
public interface ProductRepo extends JpaRepository<Product, Long> {
}
