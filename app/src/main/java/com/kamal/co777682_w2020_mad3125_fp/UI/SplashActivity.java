package com.kamal.co777682_w2020_mad3125_fp.UI;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.kamal.co777682_w2020_mad3125_fp.DataStorage;
import com.kamal.co777682_w2020_mad3125_fp.R;

public class SplashActivity extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        this.setTitle("");
        DataStorage.getInstance().loadCustomerDetails();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent mIntent = new Intent(SplashActivity.this, LoginActivity.class);
                startActivity(mIntent);
                finish();
            }
        }, SPLASH_TIME_OUT);
    }
}