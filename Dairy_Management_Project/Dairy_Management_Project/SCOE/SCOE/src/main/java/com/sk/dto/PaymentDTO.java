package com.sk.dto;

import java.util.Date;

public class PaymentDTO {
    private Long farmerId;
    private String farmerName;
    private double totalLiters;
    private Date lastPaidOn;
    private double amountPaid;

    public PaymentDTO(Long farmerId, String farmerName, double totalLiters, Date lastPaidOn, double amountPaid) {
        this.farmerId = farmerId;
        this.farmerName = farmerName;
        this.totalLiters = totalLiters;
        this.lastPaidOn = lastPaidOn;
        this.amountPaid = amountPaid;
    }

    // Getters and Setters
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
