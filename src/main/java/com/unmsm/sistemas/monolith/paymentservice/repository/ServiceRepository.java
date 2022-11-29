package com.unmsm.sistemas.monolith.paymentservice.repository;

import com.unmsm.sistemas.monolith.paymentservice.model.ServiceEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ServiceRepository extends JpaRepository<ServiceEntity, Integer>{
    List<ServiceEntity> findByCustomerId(Integer id);
}