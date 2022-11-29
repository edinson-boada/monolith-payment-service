package com.unmsm.sistemas.monolith.paymentservice.service;

import com.unmsm.sistemas.monolith.paymentservice.model.InvoiceEntity;

public interface PaymentService {
    InvoiceEntity payService(Integer serviceId);
}