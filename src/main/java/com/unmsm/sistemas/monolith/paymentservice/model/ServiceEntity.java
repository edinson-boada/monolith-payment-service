package com.unmsm.sistemas.monolith.paymentservice.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "services")
public class ServiceEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne(fetch = FetchType.EAGER)
    @Column(name = "service_name")
    private ServiceNameEntity serviceName;

    @ManyToOne(fetch = FetchType.LAZY)
    private CustomerEntity customer;

    @Column(name = "registration_date")
    private LocalDate registrationDate;
}