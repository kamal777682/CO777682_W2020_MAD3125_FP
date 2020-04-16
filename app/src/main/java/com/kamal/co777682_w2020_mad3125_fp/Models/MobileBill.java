package com.kamal.co777682_w2020_mad3125_fp.Models;

public class MobileBill extends Bill{
    private String manufacturerName;
    private String mobilePlan;
    private String mobileNumber;
    private int internetGBUsed;
    private int minuteUsed;

    public MobileBill(String billId, String billDate, String billType,String totalBillAmount, String manufacturerName,
                      String mobilePlan, String mobileNumber, int internetGBUsed, int minuteUsed) {
        super(billId, billDate, billType, totalBillAmount);
        this.manufacturerName = manufacturerName;
        this.mobilePlan = mobilePlan;
        this.mobileNumber = mobileNumber;
        this.internetGBUsed = internetGBUsed;
        this.minuteUsed = minuteUsed;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public String getMobilePlan() {
        return mobilePlan;
    }

    public void setMobilePlan(String mobilePlan) {
        this.mobilePlan = mobilePlan;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public int getInternetGBUsed() {
        return internetGBUsed;
    }

    public void setInternetGBUsed(int internetGBUsed) {
        this.internetGBUsed = internetGBUsed;
    }

    public int getMinuteUsed() {
        return minuteUsed;
    }

    public void setMinuteUsed(int minuteUsed) {
        this.minuteUsed = minuteUsed;
    }
}
