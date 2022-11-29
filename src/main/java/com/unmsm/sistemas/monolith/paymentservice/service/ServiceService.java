package com.unmsm.sistemas.monolith.paymentservice.service;

import com.unmsm.sistemas.monolith.paymentservice.model.ServiceEntity;

import java.util.List;

public interface ServiceService {
    List<ServiceEntity> getByCustomerId(Integer id);
}