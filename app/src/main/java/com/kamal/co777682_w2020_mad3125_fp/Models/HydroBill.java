package com.kamal.co777682_w2020_mad3125_fp.Models;

public class HydroBill extends Bill {
    private String agencyName;
    private String unitConsumed;

    public HydroBill(String billId, String billDate, String billType, String totalBillAmount, String agencyName, String unitConsumed) {
        super(billId, billDate, billType, totalBillAmount);
        this.agencyName = agencyName;
        this.unitConsumed = unitConsumed;
    }

    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public String getUnitConsumed() {
        return unitConsumed;
    }

    public void setUnitConsumed(String unitConsumed) {
        this.unitConsumed = unitConsumed;
    }
}
