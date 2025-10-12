package com.example.strategyDemo2.service.impl;

import com.example.strategyDemo2.constant.PaymentConstant;
import com.example.strategyDemo2.dto.PaymentRequestDTO;
import com.example.strategyDemo2.service.PaymentService;
import org.springframework.stereotype.Service;


@Service(PaymentConstant.WECHAT_PAY)
public class WechatPayServiceImpl implements PaymentService {
    @Override
    public String pay(PaymentRequestDTO paymentRequestDTO) {
        return "我是 WechatPay";
    }
}
