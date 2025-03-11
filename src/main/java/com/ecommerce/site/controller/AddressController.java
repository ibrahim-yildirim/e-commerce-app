package com.ecommerce.site.controller;

import com.ecommerce.site.common.Constants;
import com.ecommerce.site.entity.AddressEntity;
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
    public ResponseEntity<AddressEntity> createAddress(@RequestBody AddressEntity address) {
        return new ResponseEntity<>(addressService.createAddress(address), HttpStatus.CREATED);
    }

    @GetMapping("getAll")
    public ResponseEntity<List<AddressEntity>> getAllAddresses() {
        return new ResponseEntity<>(addressService.getAllAddresses(), HttpStatus.OK);
    }

    @PutMapping("update")
    public ResponseEntity<AddressEntity> updateAddress(@RequestBody AddressEntity address) {
        return new ResponseEntity<>(addressService.updateAddress(address), HttpStatus.OK);
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<String> deleteAddress(@PathVariable("id") Long addressId) {
        addressService.deleteAddress(addressId);
        return new ResponseEntity<>(Constants.Address.DELETE_SUCCESS, HttpStatus.OK);
    }

}
