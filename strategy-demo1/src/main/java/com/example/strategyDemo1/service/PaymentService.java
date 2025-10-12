package com.example.strategyDemo1.service;

import com.example.strategyDemo1.dto.PaymentRequestDTO;


public interface PaymentService {
    String pay(PaymentRequestDTO paymentRequestDTO);
}
