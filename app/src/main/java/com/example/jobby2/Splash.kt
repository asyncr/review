package com.example.jobby2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer

class Splash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        startTime()
    }
    fun startTime(){
        object: CountDownTimer(3000,1000){
            override fun onTick(p0: Long) {
                //TODO("Not yet implemented")
            }

            override fun onFinish() {
                //TODO("Not yet implemented")
                val intent = Intent(applicationContext, MainActivity::class.java).apply {  }
                startActivity(intent)
            }
        }.start()
    }
}