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
import com.kamal.co777682_w2020_mad3125_fp.Models.HydroBill;
import com.kamal.co777682_w2020_mad3125_fp.Models.InternetBill;
import com.kamal.co777682_w2020_mad3125_fp.R;

import java.util.Calendar;

public class AddInternetBillActivity extends AppCompatActivity implements DatePickerDialog.OnDateSetListener {
    private TextInputEditText billId;
    private TextInputEditText billDate;
    private TextInputEditText internetProvider;
    private TextInputEditText internetGBUsed;
    private TextInputEditText billAmount;
    private Button btnSave;
    private Button btnCancel;
    public  static   Customers cust;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_internet_bill);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Add Internet Bill");
        billId = findViewById(R.id.txtBillID);
        billDate = findViewById(R.id.txtBillDate);
        internetProvider = findViewById(R.id.txtInternetProvider);
        internetGBUsed = findViewById(R.id.txtGBUsed);
        btnSave = findViewById(R.id.btnSave);
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String billid = billId.getText().toString().trim();
                String billdate = billDate.getText().toString().trim();
                String billamount = billAmount.getText().toString().trim();
                String intP = internetProvider.getText().toString().trim();
                String usage = internetGBUsed.getText().toString().trim();
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
                } if(intP.isEmpty())
                {
                    internetProvider.setError("Enter the Provider Name");
                } if(usage.isEmpty())
                {
                    internetGBUsed.setError("Enter the Internet Used(GB)");
                }
                else
                {
                    InternetBill tempInternet = new InternetBill(billid,billdate,Double.parseDouble(billamount),intP, Integer.parseInt(usage));
                    cust.addBill(tempInternet.getBillId(), tempInternet);
                    Intent intent = new Intent(AddInternetBillActivity.this,ShowBillDetailsActivity.class);
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

