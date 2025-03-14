package com.ecommerce.site.controller;

import com.ecommerce.site.common.constant.Address;
import com.ecommerce.site.entity.AddressEntity;
import com.ecommerce.site.entity.dto.AddressEntityDTO;
import com.ecommerce.site.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/addresses")
public class AddressController {

    @Autowired
    AddressService addressService;

    @PostMapping("create")
    public ResponseEntity<AddressEntity> createAddress(@RequestBody AddressEntityDTO address) {
        return new ResponseEntity<>(addressService.createAddress(address), HttpStatus.CREATED);
    }

    @GetMapping("getAll")
    public ResponseEntity<List<AddressEntity>> getAllAddresses() {
        return new ResponseEntity<>(addressService.getAllAddresses(), HttpStatus.OK);
    }

    @PutMapping("update/{id}")
    public ResponseEntity<AddressEntity> updateAddress(@RequestBody AddressEntityDTO address, @PathVariable("id") Long addressId) {
        return new ResponseEntity<>(addressService.updateAddress(address, addressId), HttpStatus.OK);
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<String> deleteAddress(@PathVariable("id") Long addressId) {
        addressService.deleteAddress(addressId);
        return new ResponseEntity<>(Address.DELETE_SUCCESS, HttpStatus.OK);
    }

}
