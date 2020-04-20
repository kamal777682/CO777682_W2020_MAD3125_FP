package com.kamal.co777682_w2020_mad3125_fp.UI;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.kamal.co777682_w2020_mad3125_fp.DataStorage;
import com.kamal.co777682_w2020_mad3125_fp.Models.Bill;
import com.kamal.co777682_w2020_mad3125_fp.Models.Customers;
import com.kamal.co777682_w2020_mad3125_fp.Models.HydroBill;
import com.kamal.co777682_w2020_mad3125_fp.Models.InternetBill;
import com.kamal.co777682_w2020_mad3125_fp.Models.MobileBill;
import com.kamal.co777682_w2020_mad3125_fp.R;

public class BillSummaryActivity extends AppCompatActivity {

    private TextView billId;
    private TextView billDate;
    private TextView billType;
    private TextView billAmount;
    private TextView txt1;
    private TextView txt2;
    private TextView txt3;
    private TextView txt4;
    private TextView txt5;
    private TextView txtinf01;
    private TextView txtinfo2;
    private TextView txtinfo3;
    private TextView txtinfo4;
    private TextView txtinfo5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bill_summary);

        ActionBar ab = getSupportActionBar();
        ab.setTitle("         Bill Details      ");

       //  Bill tempObj = (DataStorage.getInstance().getBill()).get(getIntent().getIntExtra("billObj",0));

        //   Customers tempObj = (Customers) getIntent().getSerializableExtra("CustomerObj");

        Bill tempObj = (Bill) getIntent().getSerializableExtra("billObj");

        billId = findViewById(R.id.textView23);
        billType = findViewById(R.id.textView24);
        billDate = findViewById(R.id.textView25);
        billAmount = findViewById(R.id.textView26);
        txt1 = findViewById(R.id.textView13);
        txt2 = findViewById(R.id.textView14);
        txt3 = findViewById(R.id.textView15);
        txt4 = findViewById(R.id.textView16);
        txt5 = findViewById(R.id.textView17);
        txtinf01 = findViewById(R.id.textView18);
        txtinfo2 = findViewById(R.id.textView19);
        txtinfo3 = findViewById(R.id.textView20);
        txtinfo4 = findViewById(R.id.textView21);
        txtinfo5 = findViewById(R.id.textView22);

        billId.setText(tempObj.getBillId());
        billType.setText(tempObj.getBillType());
        billDate.setText(tempObj.getBillDate());
        billAmount.setText(tempObj.getTotalBillAmount().toString());

        if(tempObj.getBillType().contains("Hydro"))
        {
            HydroBill hydroBill = (HydroBill) tempObj;
            txt1.setText("Agency Name");
            txtinf01.setText(hydroBill.getAgencyName());

            txt2.setText("Unit Consumed");
            txtinfo2.setText(hydroBill.getUnitConsumed().toString());
        }
        else if(tempObj.getBillType().contains("Internet"))
        {
            InternetBill internetBill = (InternetBill) tempObj;
            txt1.setText("Provider Name: ");
            txtinf01.setText(internetBill.getInternetProvider());

            txt2.setText("Internet Usage : ");
            txtinfo2.setText(internetBill.getInternetGBUsed());
        }else if(tempObj.getBillType().contains("Mobile"))
        {
           MobileBill mobileBill = (MobileBill) tempObj;
            txt1.setText("Manufacturer Name : ");
            txtinf01.setText(mobileBill.getManufacturerName());

            txt2.setText("Mobile Plan : ");
            txtinfo2.setText(mobileBill.getMobilePlan());

            txt3.setText("Mobile Number : ");
            txtinfo3.setText(mobileBill.getMobileNumber());

            txt4.setText("Internet Used(GB) : ");
            txtinfo4.setText(mobileBill.getInternetGBUsed());

            txt5.setText(" Minute Used In Talk :");
            txtinfo5.setText(mobileBill.getMinuteUsed());
        }




    }
}
