package com.lauron.roadreadyui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lauron.roadreadyui.databinding.ActivitySignUpBuyerBinding
import com.lauron.roadreadyui.databinding.ActivitySignUpDealerBinding

class SignUpDealerActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySignUpDealerBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpDealerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textViewLogin.setOnClickListener {
            // Start the SignUpActivity when the text is clicked
            startActivity(Intent(this, LoginActivity::class.java))
        }
        binding.buttonSignUp.setOnClickListener {
            // Start the NextActivity when the button is clicked
            startActivity(Intent(this, VerificationActivity::class.java))
        }
    }
}