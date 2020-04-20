package com.kamal.co777682_w2020_mad3125_fp.UI;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.kamal.co777682_w2020_mad3125_fp.Adapters.CustomerListAdapter;
import com.kamal.co777682_w2020_mad3125_fp.Singleton.DataStorage;
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

       ActionBar actionBar = getSupportActionBar();
       actionBar.setTitle("Customer's List");

        rvcustomerList = findViewById(R.id.customer_lists);
        displayCustomers();
        CustomerListAdapter = new CustomerListAdapter(customers);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(this,RecyclerView.VERTICAL,false);
        rvcustomerList.setLayoutManager(mLayoutManager);
        rvcustomerList.setAdapter(CustomerListAdapter);
        }
        private void displayCustomers()
        {
            customers = new ArrayList<>(DataStorage.getInstance().getCustomers());
        }

    //https://javatpoint.com/android-option-menu-example


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.customer_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.logout:
                Intent lintent = new Intent((CustomerListActivity.this), LoginActivity.class);
                startActivity(lintent);
                return true;
            case R.id.addCustomer:
                Intent cIntent = new Intent((CustomerListActivity.this), AddNewCustomerActivity.class);
                startActivity(cIntent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}

