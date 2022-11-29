package com.unmsm.sistemas.monolith.paymentservice.service.impl;

import com.unmsm.sistemas.monolith.paymentservice.model.CustomerEntity;
import com.unmsm.sistemas.monolith.paymentservice.repository.CustomerRepository;
import com.unmsm.sistemas.monolith.paymentservice.service.CustomerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;

@Slf4j
@Service
@Transactional
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private static final String PERSON_NOT_FOUND = "Persona no encontrada";
    private final CustomerRepository personRepository;

  @Override
  public CustomerEntity getById(Integer id) {
    log.info("findById for person");
    return personRepository
        .findById(id)
        .orElseThrow(() -> new EntityNotFoundException(PERSON_NOT_FOUND));
    }

    @Override
    public boolean findByDocNumber(String docNumber) {
        return personRepository.findByDocNumber(docNumber).isPresent();
    }
}