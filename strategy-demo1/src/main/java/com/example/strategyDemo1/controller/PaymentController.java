package com.example.strategyDemo1.controller;

import com.example.strategyDemo1.dto.PaymentRequestDTO;
import com.example.strategyDemo1.service.PaymentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @PostMapping("/pay")
    public String pay(@RequestBody PaymentRequestDTO paymentRequestDTO) {
        return paymentService.pay(paymentRequestDTO);
    }
}
