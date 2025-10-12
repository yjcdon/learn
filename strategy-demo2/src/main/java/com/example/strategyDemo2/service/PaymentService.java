package com.example.strategyDemo2.service;

import com.example.strategyDemo2.dto.PaymentRequestDTO;


public interface PaymentService {
    String pay(PaymentRequestDTO paymentRequestDTO);
}
