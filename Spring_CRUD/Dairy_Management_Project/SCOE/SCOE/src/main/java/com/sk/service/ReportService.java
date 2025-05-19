package com.sk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sk.repository.FarmerRepository;
import com.sk.repository.DeliveryRepository;

@Service
public class ReportService {

    @Autowired
    private FarmerRepository farmerRepository;

    @Autowired
    private DeliveryRepository deliveryRepository;

    public double getTotalMilkCollected() {
        return farmerRepository.findAll().stream().mapToDouble(farmer -> farmer.getMilkQuantity()).sum();
    }

    public double getTotalMilkDelivered() {
        return deliveryRepository.findAll().stream().mapToDouble(delivery -> delivery.getMilkQuantity()).sum();
    }
}
