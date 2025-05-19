package com.sk.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sk.entity.Delivery;

public interface DeliveryRepository extends JpaRepository<Delivery, Long> {
}
