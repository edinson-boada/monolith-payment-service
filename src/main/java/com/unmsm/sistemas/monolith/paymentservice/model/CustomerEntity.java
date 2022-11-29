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

@Getter
@Setter
@Entity
@Table(name = "customers")
public class CustomerEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private String names;

  @Column(name = "surname_p", unique = true)
  private String surnameP;

  @Column(name = "surname_m", unique = true)
  private String surnameM;

  private String photo;

  @OneToOne(fetch = FetchType.EAGER)
  private DocTypeEntity docType;

  @Column(name = "doc_number", unique = true)
  private String docNumber;

  @OneToOne(fetch = FetchType.EAGER)
  private DepartmentEntity department;

  @OneToOne(fetch = FetchType.EAGER)
  private ProvinceEntity province;

  @OneToOne(fetch = FetchType.EAGER)
  private DistrictEntity district;

  private String address;
  private String email;
  private String cellphone;
}
