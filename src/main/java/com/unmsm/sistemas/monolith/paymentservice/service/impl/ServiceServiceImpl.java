package com.unmsm.sistemas.monolith.paymentservice.service.impl;

import com.unmsm.sistemas.monolith.paymentservice.model.ServiceEntity;
import com.unmsm.sistemas.monolith.paymentservice.repository.ServiceRepository;
import com.unmsm.sistemas.monolith.paymentservice.service.ServiceService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ServiceServiceImpl implements ServiceService {
    private final ServiceRepository serviceRepository;

    @Override
    public List<ServiceEntity> getByCustomerId(Integer id) {
        return serviceRepository.findByCustomerId(id);
    }
}