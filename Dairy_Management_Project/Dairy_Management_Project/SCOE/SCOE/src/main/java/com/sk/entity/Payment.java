package com.sk.entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "payments")
public class Payment {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long farmerId;
    private String farmerName;
    private double totalLiters;
    private Date lastPaidOn;
    private double amountPaid;

    // Constructors
    public Payment() {}

    public Payment(Long farmerId, String farmerName, double totalLiters, Date lastPaidOn, double amountPaid) {
        this.farmerId = farmerId;
        this.farmerName = farmerName;
        this.totalLiters = totalLiters;
        this.lastPaidOn = lastPaidOn;
        this.amountPaid = amountPaid;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Long getFarmerId() { return farmerId; }
    public void setFarmerId(Long farmerId) { this.farmerId = farmerId; }

    public String getFarmerName() { return farmerName; }
    public void setFarmerName(String farmerName) { this.farmerName = farmerName; }

    public double getTotalLiters() { return totalLiters; }
    public void setTotalLiters(double totalLiters) { this.totalLiters = totalLiters; }

    public Date getLastPaidOn() { return lastPaidOn; }
    public void setLastPaidOn(Date lastPaidOn) { this.lastPaidOn = lastPaidOn; }

    public double getAmountPaid() { return amountPaid; }
    public void setAmountPaid(double amountPaid) { this.amountPaid = amountPaid; }
}
