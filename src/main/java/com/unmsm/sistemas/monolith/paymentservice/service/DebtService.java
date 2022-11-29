package com.unmsm.sistemas.monolith.paymentservice.service;

import com.unmsm.sistemas.monolith.paymentservice.model.DebtEntity;

import java.util.List;

public interface DebtService {
    List<DebtEntity> getByServiceCustomerId(Integer id);
    DebtEntity getByServiceId(Integer id);
}