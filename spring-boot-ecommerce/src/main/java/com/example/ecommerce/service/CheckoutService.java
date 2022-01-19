package com.example.ecommerce.service;

import com.example.ecommerce.dto.Purchase;
import com.example.ecommerce.dto.PurchaseResponse;

/**
 * Created by adam on 2022. 01. 19.
 */
public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
