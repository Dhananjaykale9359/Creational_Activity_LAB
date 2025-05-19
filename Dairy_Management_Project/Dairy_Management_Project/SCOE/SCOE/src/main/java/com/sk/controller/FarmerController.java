package com.sk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.sk.entity.Farmer;
import com.sk.service.FarmerService;

import java.util.List;

@RestController
@RequestMapping("/farmers")
@CrossOrigin(origins = "*") // Allow frontend to access backend
public class FarmerController {

    @Autowired
    private FarmerService farmerService;

    @GetMapping
    public List<Farmer> getAllFarmers() {
        return farmerService.getAllFarmers();
    }

    @PostMapping
    public ResponseEntity<Farmer> addFarmer(@RequestBody Farmer farmer) {
        Farmer savedFarmer = farmerService.addFarmer(farmer);
        return ResponseEntity.ok(savedFarmer);
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateFarmer(@PathVariable Long id, @RequestBody Farmer updatedFarmer) {
        Farmer updated = farmerService.updateMilkQuantity(id, updatedFarmer.getMilkQuantity());
        return updated != null ? ResponseEntity.ok("Updated Successfully") : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteFarmer(@PathVariable Long id) {
        farmerService.deleteFarmer(id);
        return ResponseEntity.ok("Deleted Successfully");
    }
}
