package com.unmsm.sistemas.monolith.paymentservice.service;

import com.unmsm.sistemas.monolith.paymentservice.model.InvoiceEntity;
import com.unmsm.sistemas.monolith.paymentservice.model.dto.PaymentDto;

public interface PaymentService {
    InvoiceEntity payService(PaymentDto request);
}