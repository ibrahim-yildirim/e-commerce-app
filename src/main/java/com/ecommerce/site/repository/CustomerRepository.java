package com.ecommerce.site.repository;

import com.ecommerce.site.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerEntity, Long> {

    List<CustomerEntity> findAll();

    CustomerEntity save(CustomerEntity customer);

    void deleteById(Long customerId);

    Optional<CustomerEntity> findById(Long customerId);

}
