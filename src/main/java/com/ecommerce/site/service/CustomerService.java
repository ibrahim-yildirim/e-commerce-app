package com.ecommerce.site.service;

import com.ecommerce.site.entity.CustomerEntity;
import com.ecommerce.site.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public CustomerEntity createCustomer(CustomerEntity customer) {
        return customerRepository.saveCustomer(customer);
    }

    public List<CustomerEntity> getAllCustomers() {
        return customerRepository.getAllCustomers();
    }

    public CustomerEntity updateCustomer(CustomerEntity customer) {
        return customerRepository.updateCustomers(customer);
    }

    public void deleteCustomer(String customerId) {
        customerRepository.deleteCustomer(customerId);
    }
}
