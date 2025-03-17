package com.ecommerce.site.controller;

import com.ecommerce.site.common.constant.CustomerOrder;
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

    @PostMapping("create")
    public ResponseEntity<CustomerOrderEntity> createCustomerOrder(@RequestBody CustomerOrderEntityDTO customerOrderEntityDTO) {
        return new ResponseEntity<>(customerOrderService.createCustomerOrder(customerOrderEntityDTO), HttpStatus.CREATED);
    }

    @GetMapping("getAll")
    public ResponseEntity<List<CustomerOrderEntity>> getAllCustomerOrders() {
        return new ResponseEntity<>(customerOrderService.getAllCustomerOrders(), HttpStatus.OK);
    }

    @PutMapping("update/{id}")
    public ResponseEntity<CustomerOrderEntity> updateCustomerOrder(@RequestBody CustomerOrderEntityDTO customerOrderEntityDTO, @PathVariable("id") Long customerOrderId) {
        return new ResponseEntity<>(customerOrderService.updateCustomerOrder(customerOrderEntityDTO, customerOrderId), HttpStatus.OK);
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<String> deleteCustomerOrder(@PathVariable("id") Long customerOrderId) {
        customerOrderService.deleteCustomerOrder(customerOrderId);
        return new ResponseEntity<>(CustomerOrder.DELETE_SUCCESS, HttpStatus.OK);
    }

}
