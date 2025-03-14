package com.ecommerce.site.controller;

import com.ecommerce.site.entity.CustomerOrderEntity;
import com.ecommerce.site.entity.dto.CustomerOrderEntityDTO;
import com.ecommerce.site.service.CustomerOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("customerOrders")
public class CustomerOrderController {

    @Autowired
    private CustomerOrderService customerOrderService;

    @GetMapping("getAll")
    public ResponseEntity<List<CustomerOrderEntity>> getAllCustomerOrders() {
        return new ResponseEntity<>(customerOrderService.getAllCustomerOrders(), HttpStatus.OK);
    }

    @PostMapping("create")
    public ResponseEntity<CustomerOrderEntity> createCustomerOrder(@RequestBody CustomerOrderEntityDTO customerOrderEntityDTO) {
        return new ResponseEntity<>(customerOrderService.createCustomerOrder(customerOrderEntityDTO), HttpStatus.CREATED);
    }

}
