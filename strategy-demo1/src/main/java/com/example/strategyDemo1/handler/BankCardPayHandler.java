package com.example.strategyDemo1.handler;

import com.example.strategyDemo1.Enum.PaymentEnum;
import com.example.strategyDemo1.dto.PaymentRequestDTO;
import org.springframework.stereotype.Component;


@Component
public class BankCardPayHandler implements PaymentHandler {
    @Override
    public boolean match(int paymentType) {
        return PaymentEnum.BANK_CARD.getPaymentType() == paymentType;
    }

    @Override
    public String pay(PaymentRequestDTO paymentRequestDTO) {
        return PaymentEnum.BANK_CARD.getPaymentName();
    }
}
