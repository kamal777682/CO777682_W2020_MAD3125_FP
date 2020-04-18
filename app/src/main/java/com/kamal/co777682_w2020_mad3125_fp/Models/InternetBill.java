package com.kamal.co777682_w2020_mad3125_fp.Models;

public class InternetBill extends Bill {
    private String internetProvider;
    private int internetGBUsed;

    public InternetBill(String billId, String billDate, Double totalBillAmount, String internetProvider,int internetGBUsed)
    {
        super(billId, billDate,"Internet", totalBillAmount);
        this.internetProvider = internetProvider;
        this.internetGBUsed = internetGBUsed;
    }

    public String getInternetProvider() {
        return internetProvider;
    }

    public void setInternetProvider(String internetProvider) {
        this.internetProvider = internetProvider;
    }

    public int getInternetGBUsed() {
        return internetGBUsed;
    }

    public void setInternetGBUsed(int internetGBUsed) {
        this.internetGBUsed = internetGBUsed;
    }
}
