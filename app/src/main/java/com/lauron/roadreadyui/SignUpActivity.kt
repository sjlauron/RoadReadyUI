package com.lauron.roadreadyui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lauron.roadreadyui.databinding.ActivitySignUpBinding

class SignUpActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySignUpBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonSignUpBuyer.setOnClickListener {
            // Start the NextActivity when the button is clicked
            startActivity(Intent(this, SignUpBuyerActivity::class.java))
        }
        binding.buttonSignUpDealer.setOnClickListener {
            // Start the NextActivity when the button is clicked
            startActivity(Intent(this, SignUpDealerActivity::class.java))
        }
        binding.textViewLogin.setOnClickListener {
            // Start the SignUpActivity when the text is clicked
            startActivity(Intent(this, LoginActivity::class.java))
        }
    }
}