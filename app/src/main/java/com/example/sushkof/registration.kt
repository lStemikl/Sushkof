package com.example.sushkof

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class registration : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)
    }
    fun Back(view: android.view.View) {
        val intent = Intent(this,authorization::class.java)
        startActivity(intent)
    }
}