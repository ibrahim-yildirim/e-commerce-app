package com.ecommerce.site.entity.dto;

public class CustomerOrderEntityDTO {

    private String orderStatus;
    private String paymentMethod;
    private Long customerId;
    private Long totalAmount;

    public CustomerOrderEntityDTO() {
    }

    public CustomerOrderEntityDTO(String orderStatus, String paymentMethod, Long customerId, Long totalAmount) {
        this.orderStatus = orderStatus;
        this.paymentMethod = paymentMethod;
        this.customerId = customerId;
        this.totalAmount = totalAmount;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Long getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Long totalAmount) {
        this.totalAmount = totalAmount;
    }
}
