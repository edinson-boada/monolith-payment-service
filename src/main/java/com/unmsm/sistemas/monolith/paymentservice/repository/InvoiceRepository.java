package com.unmsm.sistemas.monolith.paymentservice.repository;

import com.unmsm.sistemas.monolith.paymentservice.model.InvoiceEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceRepository extends JpaRepository<InvoiceEntity, Integer>{
}