package com.kamal.co777682_w2020_mad3125_fp.UI;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;
import com.kamal.co777682_w2020_mad3125_fp.R;

public class AddHydroBillActivity extends AppCompatActivity {

    private TextInputEditText billId;
    private TextInputEditText billDate;
    private TextInputEditText billType;
    private TextInputEditText AgencyName;
    private TextInputEditText UnitConsumed;
    private TextInputEditText billAmount;
    private Button btnSave;
    private Button btnCancel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_hydro_bill);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Add Hydro Bill");
        billId = findViewById(R.id.txtBillID);
        billDate = findViewById(R.id.txtBillDate);
        billType = findViewById(R.id.txtBillType);
        AgencyName = findViewById(R.id.txtAgencyName);
        UnitConsumed = findViewById(R.id.txtUnitConsumed);
        billAmount = findViewById(R.id.txtBillAmount);
        btnSave = findViewById(R.id.btnSave);
        btnCancel= findViewById(R.id.btnCancel);
    }
}
