package com.example.jobby2

import android.content.Intent
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import com.example.jobby2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        getDatos()
        sesion()
    }
    fun getDatos(){
        val email = binding.correoeditTextText.text.toString()
        val correo = binding.contrasenaeditText.text.toString()
    }

    fun sesion(){
        binding.btnIsesion.setOnClickListener {
            startActivity(Intent(this,Chat::class.java))
        }
        binding.btnRegistrar.setOnClickListener {
            startActivity(Intent(this,Signup::class.java))
        }
    }
}