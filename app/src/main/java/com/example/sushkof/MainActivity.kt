package com.example.sushkof

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import com.google.android.material.bottomnavigation.BottomNavigationView


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val timer = object: CountDownTimer( 3000,1000){
            override fun onTick(millisUntilFinishing: Long) {}

            override fun onFinish() {
                startActivity(Intent ( this@MainActivity, onboardin1::class.java))
                finish()
            }
        }
        timer.start()
    }
}