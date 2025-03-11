package com.ecommerce.site.controller;

import com.ecommerce.site.common.Constants;
import com.ecommerce.site.entity.CustomerEntity;
import com.ecommerce.site.entity.dto.CustomerEntityDTO;
import com.ecommerce.site.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @PostMapping("create")
    public ResponseEntity<CustomerEntity> createCustomer(@RequestBody CustomerEntityDTO customer) {
        return new ResponseEntity<>(customerService.createCustomer(customer), HttpStatus.CREATED);
    }

    @GetMapping("getAll")
    public ResponseEntity<List<CustomerEntity>> getAllCustomers() {
        return new ResponseEntity<>(customerService.getAllCustomers(), HttpStatus.OK);
    }

    @PutMapping("update/{id}")
    public ResponseEntity<CustomerEntity> updateCustomer(@RequestBody CustomerEntityDTO customer, @PathVariable("id") Long customerId) {
        return new ResponseEntity<>(customerService.updateCustomer(customer, customerId), HttpStatus.OK);
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<String> deleteCustomer(@PathVariable("id") Long customerId) {
        customerService.deleteCustomer(customerId);
        return new ResponseEntity<>(Constants.Customer.DELETE_SUCCESS, HttpStatus.OK);
    }

}
