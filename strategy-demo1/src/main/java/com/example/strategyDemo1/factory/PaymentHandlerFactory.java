package com.example.strategyDemo1.factory;

import com.example.strategyDemo1.handler.PaymentHandler;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component
public class PaymentHandlerFactory {
    @Resource
    private List<PaymentHandler> paymentHandlers;

    public PaymentHandler match(int paymentType) {
        return paymentHandlers.stream()
                .filter(handler -> handler.match(paymentType))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("未知支付类型"));
    }
}
