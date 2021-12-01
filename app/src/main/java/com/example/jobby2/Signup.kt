package com.example.jobby2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.jobby2.databinding.ActivitySignupBinding

class Signup : AppCompatActivity() {
    private lateinit var binding: ActivitySignupBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignupBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnRegisterR.setOnClickListener {
            Toast.makeText(this, " Only User Test ", Toast.LENGTH_SHORT).show()
        }
    }

}