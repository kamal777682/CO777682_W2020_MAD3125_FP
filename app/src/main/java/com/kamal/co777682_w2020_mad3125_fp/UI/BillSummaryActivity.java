package com.kamal.co777682_w2020_mad3125_fp.UI;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.kamal.co777682_w2020_mad3125_fp.Models.Bill;
import com.kamal.co777682_w2020_mad3125_fp.R;

public class BillSummaryActivity extends AppCompatActivity {

    private TextView billId;
    private TextView billDate;
    private TextView billType;
    private TextView billAmount;
    private TextView agencyName;
    private TextView unitConsumed;
    private TextView internetUsage;
    private TextView manufactureName;
    private TextView mobilePlan;
    private TextView mobileNumber;
    private TextView mobileInternetused;
    private TextView minuteUsed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bill_summary);

        ActionBar ab = getSupportActionBar();
        ab.setTitle("         Bill Details      ");

        Bill tempObj = (Bill) getIntent().getSerializableExtra("billObj");

        billId = findViewById(R.id.textView23);
        billType = findViewById(R.id.textView24);
        billDate = findViewById(R.id.textView25);
        billAmount = findViewById(R.id.textView26);



    }
}
