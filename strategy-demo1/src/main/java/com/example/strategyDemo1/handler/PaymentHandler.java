package com.example.strategyDemo1.handler;

import com.example.strategyDemo1.dto.PaymentRequestDTO;
import org.springframework.stereotype.Component;

@Component
public interface PaymentHandler {
    boolean match(int paymentType);

    String pay(PaymentRequestDTO paymentRequestDTO);
}
