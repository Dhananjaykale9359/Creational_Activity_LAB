package com.sk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sk.entity.Delivery;
import com.sk.repository.DeliveryRepository;

import java.util.List;
import java.util.Optional;

@Service
public class DeliveryService {

    @Autowired
    private DeliveryRepository deliveryRepository;

    public List<Delivery> getAllDeliveries() {
        return deliveryRepository.findAll();
    }

    public Delivery addDelivery(Delivery delivery) {
        return deliveryRepository.save(delivery);
    }

    public Delivery updateMilkQuantity(Long id, double milkQuantity) {
        Optional<Delivery> deliveryOptional = deliveryRepository.findById(id);
        if (deliveryOptional.isPresent()) {
            Delivery delivery = deliveryOptional.get();
            delivery.setMilkQuantity(milkQuantity);
            return deliveryRepository.save(delivery);
        }
        return null;
    }

    public void deleteDelivery(Long id) {
        deliveryRepository.deleteById(id);
    }
}
