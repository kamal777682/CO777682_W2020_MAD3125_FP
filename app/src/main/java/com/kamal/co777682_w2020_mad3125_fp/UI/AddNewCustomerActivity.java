
package com.kamal.co777682_w2020_mad3125_fp.UI;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;
import com.kamal.co777682_w2020_mad3125_fp.R;

public class AddNewCustomerActivity extends AppCompatActivity {

    private TextInputEditText custId;
    private TextInputEditText fName;
    private TextInputEditText lName;
    private TextInputEditText city;
    private TextInputEditText email;
    private Button btnSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_customer);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Add New Customer");
        custId = findViewById(R.id.txtCustID);
        fName = findViewById(R.id.txtFirstName);
        lName = findViewById(R.id.txtLastName);
        city = findViewById(R.id.txtCity);
        email = findViewById(R.id.txtCustEmail);
        btnSave = findViewById(R.id.btnSave);

    }

}
