package com.unmsm.sistemas.monolith.paymentservice.repository;

import com.unmsm.sistemas.monolith.paymentservice.model.DebtEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DebtRepository extends JpaRepository<DebtEntity, Integer>{
    List<DebtEntity> findByServiceCustomerId(Integer id);
    DebtEntity findByServiceId(Integer id);
}