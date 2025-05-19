package com.sk.entity;
import jakarta.persistence.*;

@Entity
@Table(name = "farmers")
public class Farmer {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    private String address;
    private String mobileNumber;
    private String accountNumber;
    private double milkQuantity;

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getMobileNumber() { return mobileNumber; }
    public void setMobileNumber(String mobileNumber) { this.mobileNumber = mobileNumber; }

    public String getAccountNumber() { return accountNumber; }
    public void setAccountNumber(String accountNumber) { this.accountNumber = accountNumber; }

    public double getMilkQuantity() { return milkQuantity; }
    public void setMilkQuantity(double milkQuantity) { this.milkQuantity = milkQuantity; }
}
