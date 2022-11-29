package com.unmsm.sistemas.monolith.paymentservice.service;

import com.unmsm.sistemas.monolith.paymentservice.model.CustomerEntity;

public interface CustomerService {

    CustomerEntity getById(Integer id);
    boolean findByDocNumber(String docNumber);
}