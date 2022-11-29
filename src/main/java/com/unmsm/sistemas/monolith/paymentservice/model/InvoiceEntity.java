package com.unmsm.sistemas.monolith.paymentservice.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "invoices")
public class InvoiceEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne(fetch = FetchType.EAGER)
    private DebtEntity debt;

    @Column(name = "total_invoice")
    private Double totalInvoice;

    @Column(name = "total_igv")
    private Double totalIgv;

    @Column(name = "create_at")
    private LocalDate createAt;
}