package com.example.sushkof

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class onboardin1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboardin1)
    }
    fun Next1(view: android.view.View) {
        val intent = Intent(this,onboardin2::class.java)
        startActivity(intent)
    }
}