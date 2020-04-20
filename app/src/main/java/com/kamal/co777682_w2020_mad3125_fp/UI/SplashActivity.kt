package com.kamal.co777682_w2020_mad3125_fp.UI

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.kamal.co777682_w2020_mad3125_fp.R
import com.kamal.co777682_w2020_mad3125_fp.UI.SplashActivity

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        this.title = ""
        Handler().postDelayed({
            val mIntent = Intent(this@SplashActivity, LoginActivity::class.java)
            startActivity(mIntent)
            finish()
        }, SPLASH_TIME_OUT.toLong())
    }

    companion object {
        private const val SPLASH_TIME_OUT = 5000
    }
}