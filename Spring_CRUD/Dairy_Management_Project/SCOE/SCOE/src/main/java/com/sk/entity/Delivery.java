package com.sk.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "deliveries")
public class Delivery {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String delivererName;
    private String address;
    private String mobileNumber;
    private String date;
    private double milkQuantity;

    // Constructors
    public Delivery() {}

    public Delivery(String delivererName, String address, String mobileNumber, String date, double milkQuantity) {
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

    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }

    public double getMilkQuantity() { return milkQuantity; }
    public void setMilkQuantity(double milkQuantity) { this.milkQuantity = milkQuantity; }
}
