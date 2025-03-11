package com.ecommerce.site.service;

import com.ecommerce.site.common.Constants;
import com.ecommerce.site.entity.AddressEntity;
import com.ecommerce.site.entity.dto.AddressEntityDTO;
import com.ecommerce.site.repository.AddressRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {

    @Autowired
    AddressRepository addressRepository;

    public AddressEntity createAddress(AddressEntityDTO address) {
        AddressEntity addressEntity = new AddressEntity();
        addressEntity.setAddressLine(address.getAddressLine());
        addressEntity.setCity(address.getCity());
        addressEntity.setCountry(address.getCountry());
        addressEntity.setZipCode(address.getZipCode());
        return addressRepository.save(addressEntity);
    }

    public List<AddressEntity> getAllAddresses() {
        return addressRepository.findAll();
    }

    public AddressEntity updateAddress(AddressEntityDTO address, Long addressId) {
        return addressRepository.findById(addressId)
                .map(addressEntity -> {
                    addressEntity.setCountry(address.getCountry());
                    addressEntity.setCity(address.getCity());
                    addressEntity.setAddressLine(address.getAddressLine());
                    addressEntity.setZipCode(address.getZipCode());
                    return addressRepository.save(addressEntity);
                }).orElseThrow(() -> new EntityNotFoundException(Constants.Address.NOT_FOUND));
    }

    public void deleteAddress(Long addressId) {
        addressRepository.deleteById(addressId);
    }

}
