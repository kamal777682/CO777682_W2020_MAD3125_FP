package com.kamal.co777682_w2020_mad3125_fp.UI;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.kamal.co777682_w2020_mad3125_fp.R;

public class BillSummaryActivity extends AppCompatActivity {

    private TextView billId;
    private  TextView billDate;
    private TextView billType;
    private TextView billAmount;
    private TextView agencyName;
    private TextView unitConsumed;
    private TextView internetProvider;
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
    }
}
