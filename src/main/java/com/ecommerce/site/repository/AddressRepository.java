package com.ecommerce.site.repository;

import com.ecommerce.site.entity.AddressEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AddressRepository extends JpaRepository<AddressEntity, Long> {

    AddressEntity save(AddressEntity address);

    List<AddressEntity> findAll();

    void deleteById(Long addressId);

    Optional<AddressEntity> findById(Long addressId);

}
