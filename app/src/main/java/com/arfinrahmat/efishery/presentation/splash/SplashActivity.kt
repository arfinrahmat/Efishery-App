package com.arfinrahmat.efishery.presentation.splash

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.arfinrahmat.efishery.R
import com.arfinrahmat.efishery.presentation.main.MainActivity
import com.arfinrahmat.efishery.utils.startActivity

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        delayAndGoToHome()
    }

    private fun delayAndGoToHome() {
        Handler(Looper.getMainLooper()).postDelayed({
            startActivity<MainActivity>()
        },2000)
    }
}