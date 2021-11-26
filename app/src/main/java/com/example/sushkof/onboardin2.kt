package com.example.sushkof

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class onboardin2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboardin2)
    }
    fun Next2(view: android.view.View) {
        val intent = Intent(this,onboardin3::class.java)
        startActivity(intent)
    }
}