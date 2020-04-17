package com.kamal.co777682_w2020_mad3125_fp.Models;

import java.io.Serializable;

public class Customers implements Serializable {
    private String customerId;
    private String firtName;
    private String lastName;
    private String email;
    private String city;

    public Customers(String customerId, String firtName, String lastName, String email, String city) {
        this.customerId = customerId;
        this.firtName = firtName;
        this.lastName = lastName;
        this.email = email;
        this.city = city;
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
}
