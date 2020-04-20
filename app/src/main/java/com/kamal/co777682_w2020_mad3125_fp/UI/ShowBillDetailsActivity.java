package com.kamal.co777682_w2020_mad3125_fp.UI;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.kamal.co777682_w2020_mad3125_fp.Adapters.ShowBillListAdapter;
import com.kamal.co777682_w2020_mad3125_fp.Adapters.ShowBillListAdapter;
import com.kamal.co777682_w2020_mad3125_fp.DataStorage;
import com.kamal.co777682_w2020_mad3125_fp.Models.Bill;
import com.kamal.co777682_w2020_mad3125_fp.Models.Customers;
import com.kamal.co777682_w2020_mad3125_fp.R;

import java.util.ArrayList;

public class ShowBillDetailsActivity extends AppCompatActivity {

    private TextView txtCustomerId;
    private TextView txtName;
    private TextView txtCity;
    private TextView txtEmail;
    private TextView txtTotalBill;
    private RecyclerView rvbills;
    private ArrayList<Bill> bills;
    private ShowBillListAdapter showBillListAdapter;
    private Customers tempObj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_bill_details);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Customer Bill Details");

        txtCustomerId = findViewById(R.id.textView3);
        txtName = findViewById(R.id.textView4);
        txtCity = findViewById(R.id.textView5);
        txtEmail = findViewById(R.id.textView6);
        txtTotalBill = findViewById(R.id.textView7);
        rvbills = findViewById(R.id.rvbills);

        tempObj = (DataStorage.getInstance().getCustomers()).get(getIntent().getIntExtra("CustomerObj",0));

        txtCustomerId.setText("Customer's Id :  " + " " +tempObj.getCustomerId());
        txtName.setText("Customer's Name : " + " " +tempObj.getFullName());
        txtCity.setText("Customer's City : "+ " "+tempObj.getCity());
        txtEmail.setText("Email :      "+ " " + tempObj.getEmail());
        txtTotalBill.setText("Total BIll To Pay : "+ " "+ tempObj.getTotalBill());

        Toast.makeText(this, tempObj.getFullName(), Toast.LENGTH_SHORT).show();

        bills = tempObj.getAllBills();
        showBillListAdapter = new ShowBillListAdapter(bills);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(this,RecyclerView.VERTICAL,false);
        rvbills.setLayoutManager(mLayoutManager);
        rvbills.setAdapter(showBillListAdapter);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.addbill_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.add_hydro:
                AddHydroBillActivity.cust = tempObj;
                Intent hIntent = new Intent((ShowBillDetailsActivity.this), AddHydroBillActivity.class);
                startActivity(hIntent);
                return true;
            case R.id.add_internet:
               // AddInternetBillActivity.cust = tempObj;
                Intent iIntent = new Intent((ShowBillDetailsActivity.this),AddInternetBillActivity.class);
                startActivity(iIntent);
                return true;
            case R.id.add_mobile:
                AddMobileBillActivity.cust = tempObj;
                Intent mIntent = new Intent((ShowBillDetailsActivity.this), AddMobileBillActivity.class);
                startActivity(mIntent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}

