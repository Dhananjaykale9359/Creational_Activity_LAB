package com.sk.dto;

public class FarmerDTO {
    private Long id;
    private String name;
    private String address;
    private String mobileNumber;
    private String accountNumber;
    private double milkQuantity;

    // Default constructor
    public FarmerDTO() {
    }

    // Parameterized constructor
    public FarmerDTO(Long id, String name, String address, String mobileNumber, String accountNumber, double milkQuantity) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.mobileNumber = mobileNumber;
        this.accountNumber = accountNumber;
        this.milkQuantity = milkQuantity;
    }

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
