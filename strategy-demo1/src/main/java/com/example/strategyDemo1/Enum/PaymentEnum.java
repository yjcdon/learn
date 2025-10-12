package com.example.strategyDemo1.Enum;



public enum PaymentEnum {
    ALIPAY(1, "支付宝"),
    WECHAT_PAY(2, "微信支付"),
    BANK_CARD(3, "银行卡支付");

    private final int paymentType;
    private final String paymentName;

    PaymentEnum(int paymentType, String paymentName) {
        this.paymentType = paymentType;
        this.paymentName = paymentName;
    }

    public int getPaymentType() {
        return paymentType;
    }

    public String getPaymentName() {
        return paymentName;
    }
}
