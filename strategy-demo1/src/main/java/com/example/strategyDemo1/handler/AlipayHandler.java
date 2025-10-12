package com.example.strategyDemo1.handler;

import com.example.strategyDemo1.Enum.PaymentEnum;
import com.example.strategyDemo1.dto.PaymentRequestDTO;
import org.springframework.stereotype.Component;


@Component
public class AlipayHandler implements PaymentHandler {

    @Override
    public boolean match(int paymentType) {
        return PaymentEnum.ALIPAY.getPaymentType() == paymentType;
    }

    @Override
    public String pay(PaymentRequestDTO paymentRequestDTO) {
        return PaymentEnum.ALIPAY.getPaymentName();
    }
}
