
package com.kamal.co777682_w2020_mad3125_fp.UI;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;
import com.kamal.co777682_w2020_mad3125_fp.Models.Customers;
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
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String customerId = custId.getText().toString().trim();
                String firstName = fName.getText().toString().trim();
                String lastName =  lName.getText().toString().trim();
                String Ccity = city.getText().toString().trim();
                String Cemail= email.getText().toString().trim();
                if(customerId.isEmpty())
                {
                    custId.setError("Please enter the Customer ID");
                }
                if(firstName.isEmpty())
                {
                    fName.setError("Please enter the First name");
                }
                if(lastName.isEmpty())
                {
                    lName.setError("Please enter the Last name");
                }
                if(Ccity.isEmpty())
                {
                    city.setError("Please enter the City");
                }
                if (Cemail.isEmpty() )
                {
                    email.setError("Please enter the Gross Income");
                }
                //https://www.regular-expressions.info/email.html
                else if (email.getText().toString().matches("\\b[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,}\\b"))
                {
                    Customers tempObj = new Customers(customerId,firstName,lastName,Ccity,Cemail);
                    Intent mIntent = new Intent(AddNewCustomerActivity.this, CustomerListActivity.class);
                    mIntent.putExtra("CRACustomerObj", tempObj);
                    startActivity(mIntent);
                }else {
                }
                }
        });

    }

}
