package com.unmsm.sistemas.monolith.paymentservice.service.impl;

import com.unmsm.sistemas.monolith.paymentservice.model.DebtEntity;
import com.unmsm.sistemas.monolith.paymentservice.repository.DebtRepository;
import com.unmsm.sistemas.monolith.paymentservice.service.DebtService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DebtServiceImpl implements DebtService {
    private final DebtRepository debtRepository;

    @Override
    public List<DebtEntity> getByServiceCustomerId(Integer customerId) {
        return debtRepository.findByServiceCustomerId(customerId);
    }

    @Override
    public DebtEntity getByServiceId(Integer serviceId) {
        return debtRepository.findByServiceId(serviceId);
    }
}