package com.sk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.sk.entity.Delivery;
import com.sk.service.DeliveryService;

import java.util.List;

@RestController
@RequestMapping("/deliveries")
@CrossOrigin(origins = "*")
public class DeliveryController {

    @Autowired
    private DeliveryService deliveryService;

    @GetMapping
    public List<Delivery> getAllDeliveries() {
        return deliveryService.getAllDeliveries();
    }

    @PostMapping
    public ResponseEntity<Delivery> addDelivery(@RequestBody Delivery delivery) {
        Delivery savedDelivery = deliveryService.addDelivery(delivery);
        return ResponseEntity.ok(savedDelivery);
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateDelivery(@PathVariable Long id, @RequestBody Delivery updatedDelivery) {
        Delivery updated = deliveryService.updateMilkQuantity(id, updatedDelivery.getMilkQuantity());
        return updated != null ? ResponseEntity.ok("Updated Successfully") : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteDelivery(@PathVariable Long id) {
        deliveryService.deleteDelivery(id);
        return ResponseEntity.ok("Deleted Successfully");
    }
}
