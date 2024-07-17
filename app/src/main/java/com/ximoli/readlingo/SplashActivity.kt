package com.ximoli.readlingo

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.ThemeUtils
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val screenSplash = installSplashScreen()
        super.onCreate(savedInstanceState)

        screenSplash.setKeepOnScreenCondition { true }

        Handler(Looper.getMainLooper()).postDelayed({
            checkUser()
        }, 1000)

    }

    private fun checkUser() {
        startActivity(Intent(this, MainActivity::class.java))
        finish()
    }

}