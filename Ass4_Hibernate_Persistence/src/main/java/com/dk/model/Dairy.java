package com.dk.model;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.*;

@Entity
@Table(name = "Dairy1")  // Ensure table name matches database
public class Dairy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int milkId;

    @Column(name = "Farmer Name")
    private String farmerName;

    @Column(name = "Milk Deliveries")
    private int milkDeliveries;

    @Column(name = "Delivery Time")
    private LocalTime deliveryTime;

    @Column(name = "Delivery Date")
    private LocalDate deliveryDate;

    public Dairy() {
        super();
    }

    public Dairy(String farmerName, int milkDeliveries, LocalTime deliveryTime, LocalDate deliveryDate) {
        this.farmerName = farmerName;
        this.milkDeliveries = milkDeliveries;
        this.deliveryTime = deliveryTime;
        this.deliveryDate = deliveryDate;
    }

    public int getMilkId() {
        return milkId;
    }

    public void setMilkId(int milkId) {
        this.milkId = milkId;
    }

    public String getFarmerName() {
        return farmerName;
    }

    public void setFarmerName(String farmerName) {
        this.farmerName = farmerName;
    }

    public int getMilkDeliveries() {
        return milkDeliveries;
    }

    public void setMilkDeliveries(int milkDeliveries) {
        this.milkDeliveries = milkDeliveries;
    }

    public LocalTime getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(LocalTime deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(LocalDate deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    @Override
    public String toString() {
        return "Dairy [milkId=" + milkId + ", farmerName=" + farmerName + ", milkDeliveries=" + milkDeliveries +
                ", deliveryTime=" + deliveryTime + ", deliveryDate=" + deliveryDate + "]";
    }
}
