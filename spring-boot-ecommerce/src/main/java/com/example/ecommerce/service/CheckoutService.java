package com.example.ecommerce.service;

import com.example.ecommerce.dto.PaymentInfo;
import com.example.ecommerce.dto.Purchase;
import com.example.ecommerce.dto.PurchaseResponse;
import com.stripe.exception.StripeException;
import com.stripe.model.PaymentIntent;

/**
 * Created by adam on 2022. 01. 19.
 */
public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);

    PaymentIntent createPaymentIntent(PaymentInfo paymentInfo) throws StripeException;
}
