package com.lauron.roadreadyui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lauron.roadreadyui.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonLogin.setOnClickListener {
            // Start the NextActivity when the button is clicked
            startActivity(Intent(this, MainActivity::class.java))
        }
        binding.textViewSignUp.setOnClickListener {
            // Start the SignUpActivity when the text is clicked
            startActivity(Intent(this, SignUpActivity::class.java))
        }
    }
}