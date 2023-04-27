package com.example.gloria

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MemestwoActivity : AppCompatActivity() {
    lateinit var btnNexttwo:Button
    lateinit var btnPrevtwo:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_memestwo)
        btnNexttwo =findViewById(R.id.btnNexttwo)
        btnNexttwo.setOnClickListener {
            val intent =Intent(this, MemesthreeActivity::class.java)
            startActivity(intent)
        }
        btnPrevtwo=findViewById(R.id.btnPrevtwo)
        btnPrevtwo.setOnClickListener {
            val intent=Intent(this, MemesoneActivity::class.java)
            startActivity(intent)
        }
    }
}