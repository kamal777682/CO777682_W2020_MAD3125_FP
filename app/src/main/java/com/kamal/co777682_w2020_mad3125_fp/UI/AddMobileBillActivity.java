package com.kamal.co777682_w2020_mad3125_fp.UI;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;

import com.google.android.material.textfield.TextInputEditText;
import com.kamal.co777682_w2020_mad3125_fp.Models.Customers;
import com.kamal.co777682_w2020_mad3125_fp.Models.InternetBill;
import com.kamal.co777682_w2020_mad3125_fp.Models.MobileBill;
import com.kamal.co777682_w2020_mad3125_fp.R;

import java.util.Calendar;

public class AddMobileBillActivity extends AppCompatActivity implements DatePickerDialog.OnDateSetListener {

    private TextInputEditText billId;
    private TextInputEditText billDate;
    private TextInputEditText manufacturerName;
    private TextInputEditText mobilePlan;
    private TextInputEditText mobileNumber;
    private TextInputEditText billAmount;
    private TextInputEditText internetGBUsed;
    private TextInputEditText minuteUsed;
    private Button btnSave;

    private static Customers customer1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_mobile_bill);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Add Mobile Bill");
        billId = findViewById(R.id.txtBillID);
        billDate = findViewById(R.id.txtBillDate);
        manufacturerName = findViewById(R.id.txtManufactureName);
        mobilePlan = findViewById(R.id.txtMobileplan);
        mobileNumber = findViewById(R.id.txtMobileNumber);
        billAmount = findViewById(R.id.txtBillAmount);
        internetGBUsed = findViewById(R.id.txtGBUsed);
        minuteUsed = findViewById(R.id.txtMinuteUsed);
        btnSave = findViewById(R.id.btnSave);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String billid = billId.getText().toString().trim();
                String billdate = billDate.getText().toString().trim();
                String billamount = billAmount.getText().toString().trim();
                String mName = manufacturerName.getText().toString().trim();
                String mobP = mobilePlan.getText().toString().trim();
                String mobN = mobileNumber.getText().toString().trim();
                String iUsed = internetGBUsed.getText().toString().trim();
                String mUsed = minuteUsed.getText().toString().trim()''
                if(billid.isEmpty())
                {
                    billId.setError("Enter Bill Id");
                }
                if(billdate.isEmpty())
                {
                    billDate.setError("Enter Bill Date");
                }
                if(billamount.isEmpty())
                {
                    billAmount.setError("Enter Bill Amount");
                } if(mName.isEmpty())
                {
                    manufacturerName.setError("Enter the Manufacturer Name");
                }
                if(mobP.isEmpty())
                {
                    mobilePlan.setError("Enter the Mobile Plan");
                }
                if(mobN.isEmpty())
                {
                    mobileNumber.setError("Enter the Mobile Number");
                }
                if(iUsed.isEmpty())
                {
                    internetGBUsed.setError("Enter the Internet Used(GB)");
                }
                if(mUsed.isEmpty())
                {
                    minuteUsed.setError("Enter the minute Used");
                }
                else
                {
                    MobileBill mobileBill = new MobileBill(billid,billdate,Double.parseDouble(billamount),mName,mobP,mobN,Integer.parseInt(iUsed),Integer.parseInt(mUsed));
                    customer1.addBill(mobileBill.getBillId(), mobileBill);
                    Intent intent = new Intent(AddMobileBillActivity.this,ShowBillDetailsActivity.class);
                    startActivity(intent);
                }
            }
        });
        findViewById(R.id.btnDatePicker).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDatePickerDialog();
            }
        });
    }
    private void showDatePickerDialog(){
        DatePickerDialog datePickerDialog = new DatePickerDialog(
                this, this,
                Calendar.getInstance().get(Calendar.DAY_OF_MONTH),
                Calendar.getInstance().get(Calendar.WEEK_OF_MONTH),
                Calendar.getInstance().get(Calendar.YEAR));
        datePickerDialog.show();
    }


    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
        String date =  dayOfMonth + "/" + month+1 + "/" + year;
        billDate.setText(date);
    }

}
