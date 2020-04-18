package com.kamal.co777682_w2020_mad3125_fp.UI;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.kamal.co777682_w2020_mad3125_fp.Adapters.ShowBillListAdapter;
import com.kamal.co777682_w2020_mad3125_fp.Adapters.ShowBillListAdapter;
import com.kamal.co777682_w2020_mad3125_fp.Models.Bill;
import com.kamal.co777682_w2020_mad3125_fp.Models.Customers;
import com.kamal.co777682_w2020_mad3125_fp.R;

import java.util.ArrayList;

public class ShowBillDetailsActivity extends AppCompatActivity {

    private RecyclerView rvbills;
    private ArrayList<Bill> bills;
    private ShowBillListAdapter showBillListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_bill_details);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Customer Bill Details");
        rvbills = findViewById(R.id.rvbills);
        Customers tempObj = (Customers) getIntent().getSerializableExtra("CustomerObj");
        bills = tempObj.getAllBills();
        showBillListAdapter = new ShowBillListAdapter(bills);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(this,RecyclerView.VERTICAL,false);
        rvbills.setLayoutManager(mLayoutManager);
        rvbills.setAdapter(showBillListAdapter);
    }

}

