package com.nazira.uts_nazirahidayatullah2

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LogIn : AppCompatActivity() {
    private lateinit var txtSignUp : TextView
    private lateinit var btnlogin : Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_log_in)

        txtSignUp= findViewById(R.id.txtSignUp)
        btnlogin= findViewById(R.id.buttonLogin)

        txtSignUp.setOnClickListener(){
            val intent = Intent(this, SignUp::class.java)
            startActivity(intent)
        }
        btnlogin.setOnClickListener(){
            val intent = Intent(this, ListOrder::class.java)
            startActivity(intent)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}