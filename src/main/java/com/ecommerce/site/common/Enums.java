package com.ecommerce.site.common;

public class Enums {

    public enum OrderStatus {
        CREATED,
        IN_PROGRESS,
        PAID,
        DELETED,
        CANCELLED
    }

    public enum PaymentMethods {
        CREDIT_CARD,
        DEBIT_CARD,
        WALLET
    }

}
