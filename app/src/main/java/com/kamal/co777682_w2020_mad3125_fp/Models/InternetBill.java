package com.kamal.co777682_w2020_mad3125_fp.Models;

public class InternetBill extends Bill {
    private String internetProvider;
    private String internetGBUsed;

    public InternetBill(String billId, String billDate, String billType, String totalBillAmount, String internetProvider, String internetGBUsed)
    {
        super(billId, billDate, billType, totalBillAmount);
        this.internetProvider = internetProvider;
        this.internetGBUsed = internetGBUsed;
    }

    public String getInternetProvider() {
        return internetProvider;
    }

    public void setInternetProvider(String internetProvider) {
        this.internetProvider = internetProvider;
    }

    public String getInternetGBUsed() {
        return internetGBUsed;
    }

    public void setInternetGBUsed(String internetGBUsed) {
        this.internetGBUsed = internetGBUsed;
    }
}
