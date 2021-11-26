package com.example.sushkof

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class onboardin3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboardin3)
    }
    fun Next3(view: android.view.View) {
        val intent = Intent(this,authorization::class.java)
        startActivity(intent)
    }
}