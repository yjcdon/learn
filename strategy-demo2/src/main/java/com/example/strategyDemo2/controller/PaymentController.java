package com.example.strategyDemo2.controller;

import com.example.strategyDemo2.dto.PaymentRequestDTO;
import com.example.strategyDemo2.service.PaymentService;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Resource
    private ApplicationContext applicationContext;

    @PostMapping("/pay")
    public String pay(@RequestBody PaymentRequestDTO paymentRequestDTO) {
        PaymentService paymentService = null;
        try {
            paymentService = (PaymentService) applicationContext.getBean(paymentRequestDTO.getPaymentName());
        } catch (BeansException e) {
            throw new RuntimeException("未知支付类型");
        }
        return paymentService.pay(paymentRequestDTO);
    }
}
