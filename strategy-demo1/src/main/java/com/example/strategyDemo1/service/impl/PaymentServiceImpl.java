package com.example.strategyDemo1.service.impl;

import com.example.strategyDemo1.dto.PaymentRequestDTO;
import com.example.strategyDemo1.factory.PaymentHandlerFactory;
import com.example.strategyDemo1.handler.PaymentHandler;
import com.example.strategyDemo1.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentHandlerFactory paymentHandlerFactory;

    @Override
    public String pay(PaymentRequestDTO paymentRequestDTO) {
        PaymentHandler paymentHandler = paymentHandlerFactory.match(paymentRequestDTO.getPaymentType());
        return paymentHandler.pay(paymentRequestDTO);
    }
}
