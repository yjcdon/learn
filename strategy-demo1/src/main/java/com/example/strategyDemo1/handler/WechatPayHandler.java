package com.example.strategyDemo1.handler;

import com.example.strategyDemo1.Enum.PaymentEnum;
import com.example.strategyDemo1.dto.PaymentRequestDTO;
import org.springframework.stereotype.Component;


@Component
public class WechatPayHandler implements PaymentHandler {
    @Override
    public boolean match(int paymentType) {
        return PaymentEnum.WECHAT_PAY.getPaymentType() == paymentType;
    }

    @Override
    public String pay(PaymentRequestDTO paymentRequestDTO) {
        return PaymentEnum.WECHAT_PAY.getPaymentName();
    }
}
