package com.example.ecommerce.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by adam on 2022. 01. 19.
 */
@Entity
@Getter
@Setter
public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String imageUrl;
    private BigDecimal unitPrice;
    private int quantity;
    private Long productId;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;
}
