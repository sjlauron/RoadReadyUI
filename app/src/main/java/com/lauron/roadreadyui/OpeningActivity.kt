package com.lauron.roadreadyui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class OpeningActivity : AppCompatActivity() {
    private val DELAY_MILLIS = 3000 // 3 seconds
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_opening)

        // Use Handler with Looper.getMainLooper() to delay the start of the next activity
        Handler(Looper.getMainLooper()).postDelayed({
            // Start the next activity after the delay
            startActivity(Intent(this, LoginActivity::class.java))
            finish() // Close the current activity
        }, DELAY_MILLIS.toLong())
    }
}