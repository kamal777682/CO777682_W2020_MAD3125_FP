package com.kamal.co777682_w2020_mad3125_fp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;

import com.google.android.material.textfield.TextInputEditText;

public class LoginActivity extends AppCompatActivity {

    private TextInputEditText email;
    private TextInputEditText password;
    private Button login;
    private CheckBox rememberMe;
    private SharedPreferences myPref;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        login = findViewById(R.id.login);
        myPref = getSharedPreferences("login",MODE_PRIVATE);
        //https://stackoverflow.com/questions/2154438/how-do-i-implement-a-remember-me-function-in-an-android-activity
        final SharedPreferences.Editor editor  = myPref.edit();

        email.setText(myPref.getString("email",null));
        password.setText(myPref.getString("password",null));

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(email.getText().toString().equals("kamal1234@gmail.com") && password.getText().toString().equals("kamal")){
                    String txtemail = email.getText().toString();
                    String txtpwd = password.getText().toString();
                    if(rememberMe.isChecked())
                    {
                        editor.putString("email",txtemail);
                        editor.putString("password",txtpwd);
                        editor.apply();
                        Intent mIntent = new Intent(LoginActivity.this,CustomerListActivity.class);
                        startActivity(mIntent);
                    }
                    else {
                        editor.clear();
                        editor.apply();
                        Intent mIntent = new Intent(LoginActivity.this,CustomerListActivity.class);
                        startActivity(mIntent);
                    }
                }
                else {
                    AlertDialog.Builder alert = new AlertDialog.Builder(LoginActivity.this);
                    alert.setCancelable(false);
                    alert.setMessage("Invalid User ID or Password");
                    alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int n) {
                            dialog.dismiss();
                        }
                    });
                    alert.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int n) {
                            dialog.cancel();
                        }
                    });
                AlertDialog alertDialog = alert.create();
                alertDialog.show();
                }
            }
        });
    }
}
