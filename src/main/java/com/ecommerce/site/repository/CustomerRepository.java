package com.ecommerce.site.repository;

import com.ecommerce.site.entity.CustomerEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomerRepository {

    public List<CustomerEntity> getAllCustomers() {
        CustomerEntity customer1 = new CustomerEntity(1L, "John", "Doe", "123456789", "a@b.com");
        CustomerEntity customer2 = new CustomerEntity(2L, "Jane", "Doe", "987654321", "c@d.com");
        return List.of(customer1, customer2);
    }

    public CustomerEntity saveCustomer(CustomerEntity customer) {
        return customer;
    }

    public CustomerEntity updateCustomers(CustomerEntity customer) {
        return customer;
    }

    public void deleteCustomer(String customerId) {

    }
}
