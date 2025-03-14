package com.ecommerce.site.service;

import com.ecommerce.site.common.enums.PaymentMethods;
import com.ecommerce.site.entity.CustomerOrderEntity;
import com.ecommerce.site.entity.dto.CustomerOrderEntityDTO;
import com.ecommerce.site.repository.CustomerOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class CustomerOrderService {

    @Autowired
    private CustomerOrderRepository customerOrderRepository;

    public List<CustomerOrderEntity> getAllCustomerOrders() {
        return customerOrderRepository.findAll();
    }

    public CustomerOrderEntity createCustomerOrder(CustomerOrderEntityDTO customerOrderEntityDTO) {
        CustomerOrderEntity customerOrderEntity = new CustomerOrderEntity();
        customerOrderEntity.setCustomerId(customerOrderEntityDTO.getCustomerId());
        customerOrderEntity.setOrderStatus(customerOrderEntityDTO.getOrderStatus());
        if (!customerOrderEntityDTO.getPaymentMethod().contains(Arrays.toString(PaymentMethods.values()))) {
            throw new IllegalArgumentException("Invalid payment method: " + customerOrderEntityDTO.getPaymentMethod());
        }
        customerOrderEntity.setPaymentMethod(customerOrderEntityDTO.getPaymentMethod());
        customerOrderEntity.setTotalAmount(customerOrderEntityDTO.getTotalAmount());
        return customerOrderRepository.save(customerOrderEntity);
    }

}
