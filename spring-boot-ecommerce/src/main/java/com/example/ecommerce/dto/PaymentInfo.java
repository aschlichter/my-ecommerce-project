package com.example.ecommerce.dto;

import lombok.Data;

/**
 * Created by adam on 2022. 02. 05.
 */
@Data
public class PaymentInfo {

    private int amount;
    private String currency;
    private String receiptEmail;
}
