package com.sk.service;

import com.sk.entity.Payment;
import com.sk.dto.PaymentDTO;
import com.sk.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    public List<PaymentDTO> getPayments(Date from, Date to) {
        List<Payment> payments = paymentRepository.findByLastPaidOnBetween(from, to);

        return payments.stream().map(payment -> new PaymentDTO(
                payment.getFarmerId(),
                payment.getFarmerName(),
                payment.getTotalLiters(),
                payment.getLastPaidOn(),
                payment.getAmountPaid()
        )).collect(Collectors.toList());
    }

    public PaymentDTO processPayment(Long farmerId) {
        Payment payment = new Payment(farmerId, "Farmer Name", 50.0, new Date(), 1500);
        Payment savedPayment = paymentRepository.save(payment);

        return new PaymentDTO(
                savedPayment.getFarmerId(),
                savedPayment.getFarmerName(),
                savedPayment.getTotalLiters(),
                savedPayment.getLastPaidOn(),
                savedPayment.getAmountPaid()
        );
    }
}
