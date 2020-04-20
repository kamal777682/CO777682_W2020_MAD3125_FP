package com.kamal.co777682_w2020_mad3125_fp.UI;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;

import com.google.android.material.textfield.TextInputEditText;
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

