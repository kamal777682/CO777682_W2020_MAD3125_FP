package com.kamal.co777682_w2020_mad3125_fp.UI;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.kamal.co777682_w2020_mad3125_fp.Adapters.CustomerListAdapter;
import com.kamal.co777682_w2020_mad3125_fp.Models.Customers;
import com.kamal.co777682_w2020_mad3125_fp.R;

import java.util.ArrayList;

public class CustomerListActivity extends AppCompatActivity {

    private RecyclerView rvcustomerList;
    private ArrayList<Customers> customers;
    private CustomerListAdapter CustomerListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_list);
        rvcustomerList = findViewById(R.id.customer_lists);
        displayCustomers();
        CustomerListAdapter = new CustomerListAdapter(customers);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(this,RecyclerView.VERTICAL,false);
        rvcustomerList.setLayoutManager(mLayoutManager);
        rvcustomerList.setAdapter(CustomerListAdapter);
        }
        private void displayCustomers()
        {}

}

