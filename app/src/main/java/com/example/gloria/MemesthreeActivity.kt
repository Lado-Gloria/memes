package com.example.gloria

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MemesthreeActivity : AppCompatActivity() {
    lateinit var btnNextthree: Button
    lateinit var btnPrevThree: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_memesthree)
        btnNextthree =findViewById(R.id.btnNextthree)
        btnNextthree.setOnClickListener {
          val intent =Intent(this,MemesfourActivity::class.java)
            startActivity(intent)
        }
        btnPrevThree = findViewById(R.id.btnPrevthree)
        btnPrevThree.setOnClickListener {
            val intent = Intent(this, MemestwoActivity::class.java)
            startActivity(intent)
        }
    }
}