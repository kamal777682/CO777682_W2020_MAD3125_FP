package com.kamal.co777682_w2020_mad3125_fp.UI;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.kamal.co777682_w2020_mad3125_fp.R;

public class AddInternetBillActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_internet_bill);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Add Internet Bill");
    }
}
