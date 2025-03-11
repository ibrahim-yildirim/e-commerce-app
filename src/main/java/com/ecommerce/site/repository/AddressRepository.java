package com.ecommerce.site.repository;

import com.ecommerce.site.entity.AddressEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AddressRepository extends JpaRepository<AddressEntity, Long> {

    AddressEntity save(AddressEntity address);

    List<AddressEntity> findAll();

    void deleteById(Long addressId);

}
