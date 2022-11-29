package com.unmsm.sistemas.monolith.paymentservice.service.impl;

import com.unmsm.sistemas.monolith.paymentservice.model.DebtEntity;
import com.unmsm.sistemas.monolith.paymentservice.model.InvoiceEntity;
import com.unmsm.sistemas.monolith.paymentservice.model.dto.PaymentDto;
import com.unmsm.sistemas.monolith.paymentservice.repository.DebtRepository;
import com.unmsm.sistemas.monolith.paymentservice.repository.InvoiceRepository;
import com.unmsm.sistemas.monolith.paymentservice.service.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
@RequiredArgsConstructor
public class PaymentServiceImpl implements PaymentService {

    private final DebtRepository debtRepository;
    private final InvoiceRepository invoiceRepository;

    @Override
    public InvoiceEntity payService(PaymentDto request) {
        DebtEntity debt = debtRepository.findByServiceId(request.getId());
        InvoiceEntity invoice = new InvoiceEntity();
        invoice.setDebt(debt);
        invoice.setTotalInvoice(debt.getMonthlyPayment() + debt.getLatePayment());
        invoice.setTotalIgv((debt.getMonthlyPayment() + debt.getLatePayment()) * 0.18);
        invoice.setCreateAt(LocalDate.now());
        debt.setPayed(true);
        debtRepository.save(debt);
        return invoiceRepository.save(invoice);
    }
}