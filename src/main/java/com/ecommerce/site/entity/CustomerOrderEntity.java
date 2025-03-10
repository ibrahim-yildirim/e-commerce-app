package com.ecommerce.site.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "customer_order")
public class CustomerOrderEntity extends AbstractEntity {

    @Id
    private Long id;
    private String orderStatus;
    private String paymentMethod;
    private Long customerId;
    private Long totalAmount;

    public CustomerOrderEntity() {
    }

    public CustomerOrderEntity(Long id, String orderStatus, String paymentMethod, Long customerId, Long totalAmount) {
        this.id = id;
        this.orderStatus = orderStatus;
        this.paymentMethod = paymentMethod;
        this.customerId = customerId;
        this.totalAmount = totalAmount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
