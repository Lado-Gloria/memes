package com.example.gloria

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MemesfourActivity : AppCompatActivity() {
    lateinit var btnPrevfour: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_memesfour)
        btnPrevfour=findViewById(R.id.btnPrevfour)
        btnPrevfour.setOnClickListener {
            val intent =Intent(this,MemesthreeActivity::class.java)
            startActivity(intent)
        }
    }
}