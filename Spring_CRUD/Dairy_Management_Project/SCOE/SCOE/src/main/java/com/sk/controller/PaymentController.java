package com.sk.controller;

import com.sk.dto.PaymentDTO;
import com.sk.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/payments")
@CrossOrigin(origins = "*")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @GetMapping
    public List<PaymentDTO> getPayments(@RequestParam Date from, @RequestParam Date to) {
        return paymentService.getPayments(from, to);
    }

    @PostMapping("/pay/{farmerId}")
    public PaymentDTO processPayment(@PathVariable Long farmerId) {
        return paymentService.processPayment(farmerId);
    }
}
