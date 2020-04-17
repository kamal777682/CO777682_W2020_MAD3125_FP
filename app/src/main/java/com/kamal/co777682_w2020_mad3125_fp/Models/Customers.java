package com.kamal.co777682_w2020_mad3125_fp.Models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class Customers implements Serializable {
    private String customerId;
    private String firtName;
    private String lastName;
    private String fullName;
    private String email;
    private String city;
    private HashMap<String,Bill>bills = new HashMap<>();
    private Double totalBill = 0.0;


    public Customers(String customerId, String firtName, String lastName, String email, String city) {
        this.customerId = customerId;
        this.firtName = firtName;
        this.lastName = lastName;
        this.fullName = getFullName();
        this.email = email;
        this.city = city;
    }
    public void addBill(String billId, Bill bill){
        this.bills.put(billId,bill);
        totalBill = totalBill + bill.getTotalBillAmount();

    }
    public ArrayList<Bill> getAllBills(){
        Collection<Bill> billCollection = bills.values();
        ArrayList<Bill> billArrayList = new ArrayList<Bill>(billCollection);
        return billArrayList;

    }

    public String getFullName() {
        return (firtName + " " +lastName) ;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getFirtName() {
        return firtName;
    }

    public void setFirtName(String firtName) {
        this.firtName = firtName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public HashMap<String, Bill> getBills() {
        return bills;
    }

    public void setBills(HashMap<String, Bill> bills) {
        this.bills = bills;
    }

    public Double getTotalBill() {
        return totalBill;
    }

    public void setTotalBill(Double totalBill) {
        this.totalBill = totalBill;
    }
}
