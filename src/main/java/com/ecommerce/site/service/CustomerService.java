package com.ecommerce.site.service;

import com.ecommerce.site.common.constant.Customer;
import com.ecommerce.site.entity.CustomerEntity;
import com.ecommerce.site.entity.dto.CustomerEntityDTO;
import com.ecommerce.site.repository.CustomerRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public CustomerEntity createCustomer(CustomerEntityDTO customer) {
        CustomerEntity customerEntity = new CustomerEntity();
        customerEntity.setFirstName(customer.getFirstName());
        customerEntity.setLastName(customer.getLastName());
        customerEntity.setPhone(customer.getPhone());
        customerEntity.setEmail(customer.getEmail());
        return customerRepository.save(customerEntity);
    }

    public List<CustomerEntity> getAllCustomers() {
        return customerRepository.findAll();
    }

    public CustomerEntity updateCustomer(CustomerEntityDTO customer, Long customerId) {
        return customerRepository.findById(customerId)
                .map(customerEntity -> {
                    customerEntity.setId(customerId);
                    customerEntity.setFirstName(customer.getFirstName());
                    customerEntity.setLastName(customer.getLastName());
                    customerEntity.setPhone(customer.getPhone());
                    customerEntity.setEmail(customer.getEmail());
                    return customerRepository.save(customerEntity);
                }).orElseThrow(() -> new EntityNotFoundException(Customer.NOT_FOUND));
    }

    public void deleteCustomer(Long customerId) {
        customerRepository.deleteById(customerId);
    }
}
