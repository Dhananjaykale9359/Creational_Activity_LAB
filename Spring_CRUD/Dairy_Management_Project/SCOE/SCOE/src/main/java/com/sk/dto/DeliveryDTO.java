package com.sk.dto;

import java.time.LocalDate;

public class DeliveryDTO {
    private Long id;
    private String delivererName;
    private String address;
    private String mobileNumber;
    private LocalDate date;
    private double milkQuantity;

    // Default Constructor
    public DeliveryDTO() {
    }

    // Parameterized Constructor
    public DeliveryDTO(Long id, String delivererName, String address, String mobileNumber, LocalDate date, double milkQuantity) {
        this.id = id;
        this.delivererName = delivererName;
        this.address = address;
        this.mobileNumber = mobileNumber;
        this.date = date;
        this.milkQuantity = milkQuantity;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getDelivererName() { return delivererName; }
    public void setDelivererName(String delivererName) { this.delivererName = delivererName; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getMobileNumber() { return mobileNumber; }
    public void setMobileNumber(String mobileNumber) { this.mobileNumber = mobileNumber; }

    public LocalDate getDate() { return date; }
    public void setDate(LocalDate date) { this.date = date; }

    public double getMilkQuantity() { return milkQuantity; }
    public void setMilkQuantity(double milkQuantity) { this.milkQuantity = milkQuantity; }
}
