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
@Table(name = "debts")
public class DebtEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne(fetch = FetchType.EAGER)
    private ServiceEntity service;

    @Column(name = "monthly_payment")
    private Double monthlyPayment;

    @Column(name = "expiration_date")
    private LocalDate expirationDate;

    @Column(name = "late_payment")
    private Double latePayment;

    @Column(name = "is_payed")
    private boolean isPayed;
}