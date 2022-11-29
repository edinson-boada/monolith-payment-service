package com.unmsm.sistemas.monolith.paymentservice.repository;

import com.unmsm.sistemas.monolith.paymentservice.model.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CustomerRepository extends JpaRepository<CustomerEntity, Integer>{
    Optional<CustomerRepository> findByDocNumber(String docNumber);
}