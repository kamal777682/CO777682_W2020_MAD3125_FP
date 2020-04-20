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
import com.kamal.co777682_w2020_mad3125_fp.DataStorage;
import com.kamal.co777682_w2020_mad3125_fp.Models.Bill;
import com.kamal.co777682_w2020_mad3125_fp.Models.Customers;
import com.kamal.co777682_w2020_mad3125_fp.Models.HydroBill;
import com.kamal.co777682_w2020_mad3125_fp.R;

import java.util.Calendar;

public class AddHydroBillActivity extends AppCompatActivity implements DatePickerDialog.OnDateSetListener {

    private TextInputEditText billId;
    private TextInputEditText billDate;
    private TextInputEditText AgencyName;
    private TextInputEditText UnitConsumed;
    private TextInputEditText billAmount;
    private Button btnSave;

    public static Customers cust;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_hydro_bill);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Add Hydro Bill");
        billId = findViewById(R.id.txtBillID);
        billDate = findViewById(R.id.txtBillDate);
        AgencyName = findViewById(R.id.txtAgencyName);
        UnitConsumed = findViewById(R.id.txtUnitConsumed);
        billAmount = findViewById(R.id.txtBillAmount);
        btnSave = findViewById(R.id.btnSave);
        findViewById(R.id.btnDatePicker).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDatePickerDialog();
            }
        });

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String billid = billId.getText().toString().trim();
                String billdate = billDate.getText().toString().trim();
                String billamount = billAmount.getText().toString().trim();
                String agName = AgencyName.getText().toString().trim();
                String Ucons = UnitConsumed.getText().toString().trim();
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
                } if(agName.isEmpty())
                {
                    AgencyName.setError("Enter the Agency Name");
                } if(Ucons.isEmpty())
                {
                    UnitConsumed.setError("Enter the Unit Consumed");
                }
                else
                {
                    HydroBill hydro = new HydroBill(billid,billdate,Double.parseDouble(billamount),agName,Double.parseDouble(Ucons));
                    cust.addBill(hydro.getBillId(), hydro);
                    Intent hintent = new Intent(AddHydroBillActivity.this,ShowBillDetailsActivity.class);
                    startActivity(hintent);
                }
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

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
