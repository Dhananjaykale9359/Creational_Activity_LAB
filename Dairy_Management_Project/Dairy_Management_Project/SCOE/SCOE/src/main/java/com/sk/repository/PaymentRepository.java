package com.sk.repository;

import com.sk.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.Date;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
    List<Payment> findByLastPaidOnBetween(Date from, Date to);
}
