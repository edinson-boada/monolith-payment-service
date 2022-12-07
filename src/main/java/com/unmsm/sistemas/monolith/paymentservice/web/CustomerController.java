package com.unmsm.sistemas.monolith.paymentservice.web;

import com.unmsm.sistemas.monolith.paymentservice.model.CustomerEntity;
import com.unmsm.sistemas.monolith.paymentservice.service.CustomerService;
import com.unmsm.sistemas.monolith.paymentservice.utils.Util;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
@RequestMapping("api/customers")
@RequiredArgsConstructor
public class CustomerController {
    private final CustomerService customerService;

    @GetMapping("/{id}")
    public CustomerEntity getById(@PathVariable("id") Integer id) throws InterruptedException {
        Util.logger();
        return customerService.getById(id);
    }

    @GetMapping("/doc-validate/{docNumber}")
    public boolean findByDocNumber(@PathVariable("docNumber") String docNumber) throws InterruptedException {
        Util.logger();
        return customerService.findByDocNumber(docNumber);
    }
}