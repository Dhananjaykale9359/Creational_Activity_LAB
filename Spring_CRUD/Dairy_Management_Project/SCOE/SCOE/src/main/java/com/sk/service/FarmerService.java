package com.sk.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sk.entity.Farmer;
import com.sk.repository.FarmerRepository;

import java.util.List;
import java.util.Optional;

@Service
public class FarmerService {

    @Autowired
    private FarmerRepository farmerRepository;

    public List<Farmer> getAllFarmers() {
        return farmerRepository.findAll();
    }

    public Farmer addFarmer(Farmer farmer) {
        return farmerRepository.save(farmer);
    }

    public Farmer updateMilkQuantity(Long id, double milkQuantity) {
        Optional<Farmer> farmerOptional = farmerRepository.findById(id);
        if (farmerOptional.isPresent()) {
            Farmer farmer = farmerOptional.get();
            farmer.setMilkQuantity(milkQuantity);
            return farmerRepository.save(farmer);
        }
        return null;
    }

    public void deleteFarmer(Long id) {
        farmerRepository.deleteById(id);
    }
}
