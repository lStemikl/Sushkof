package com.example.sushkof

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.util.Patterns
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import com.example.sushkof.ui.home.HomeFragment
import java.util.regex.Pattern

class authorization : AppCompatActivity() {
    lateinit var email: EditText
    lateinit var password: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_authorization)
        email = findViewById(R.id.Email)
        password = findViewById(R.id.Password)
    }

    fun Enter(view: android.view.View) {
        if (email.text.isNotEmpty() && password.text.isNotEmpty() && Patterns.EMAIL_ADDRESS.matcher(email.text).matches()){
            val intent = Intent(this@authorization,Menu::class.java)
            startActivity(intent)
        }
        else{
            val alert = AlertDialog.Builder(this)
                .setTitle("Ошибка входа.")
                .setMessage("У вас есть пустые поля")
                .setPositiveButton("Ок",null)
                .create()
                .show()
        }
    }
    fun Reg(view: android.view.View){
        val intent = Intent(this,registration::class.java)
        startActivity(intent)
    }

}