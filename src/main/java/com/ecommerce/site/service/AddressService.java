package com.ecommerce.site.service;

import com.ecommerce.site.entity.AddressEntity;
import com.ecommerce.site.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {

    @Autowired
    AddressRepository addressRepository;

    public AddressEntity createAddress(AddressEntity address) {
        return addressRepository.save(address);
    }

    public List<AddressEntity> getAllAddresses() {
        return addressRepository.findAll();
    }

    public AddressEntity updateAddress(AddressEntity address) {
        return addressRepository.save(address);
    }

    public void deleteAddress(Long addressId) {
        addressRepository.deleteById(addressId);
    }

}
