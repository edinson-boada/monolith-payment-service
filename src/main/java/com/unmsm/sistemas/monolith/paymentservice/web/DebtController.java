package com.unmsm.sistemas.monolith.paymentservice.web;

import com.unmsm.sistemas.monolith.paymentservice.model.DebtEntity;
import com.unmsm.sistemas.monolith.paymentservice.service.DebtService;
import com.unmsm.sistemas.monolith.paymentservice.utils.Util;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("api/debts")
@RequiredArgsConstructor
public class DebtController {
    private final DebtService debtService;

    @GetMapping("/customer/{id}")
    public List<DebtEntity> getByServiceCustomerId(@PathVariable("id") Integer id) throws InterruptedException {
        Util.logger();
        return debtService.getByServiceCustomerId(id);
    }

    @GetMapping("/service/{id}")
    public DebtEntity getByServiceId(@PathVariable("id") Integer id) throws InterruptedException {
        Util.logger();
        return debtService.getByServiceId(id);
    }
}