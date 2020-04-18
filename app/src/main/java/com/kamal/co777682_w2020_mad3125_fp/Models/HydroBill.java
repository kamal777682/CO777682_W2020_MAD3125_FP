package com.kamal.co777682_w2020_mad3125_fp.Models;

public class HydroBill extends Bill {
    private String agencyName;
    private Double unitConsumed;

    public HydroBill(String billId, String billDate, Double totalBillAmount, String agencyName, Double unitConsumed) {
        super(billId, billDate, "Hydro", totalBillAmount);
        this.agencyName = agencyName;
        this.unitConsumed = unitConsumed;
    }

    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public Double getUnitConsumed() {
        return unitConsumed;
    }

    public void setUnitConsumed(Double unitConsumed) {
        this.unitConsumed = unitConsumed;
    }
}
