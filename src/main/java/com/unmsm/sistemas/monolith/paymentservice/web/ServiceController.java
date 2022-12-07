package com.unmsm.sistemas.monolith.paymentservice.web;

import com.unmsm.sistemas.monolith.paymentservice.model.ServiceEntity;
import com.unmsm.sistemas.monolith.paymentservice.service.ServiceService;
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
@RequestMapping("api/services")
@RequiredArgsConstructor
public class ServiceController {
    private final ServiceService serviceService;

    @GetMapping("/customer/{id}")
    public List<ServiceEntity> getByCustomerId(@PathVariable("id") Integer id) throws InterruptedException {
        Util.logger();
        return serviceService.getByCustomerId(id);
    }
}