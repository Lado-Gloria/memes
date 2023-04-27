package com.example.gloria

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MemesoneActivity : AppCompatActivity() {
    lateinit var btnNextone:Button
    lateinit var btnPrevone:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_memesone)
        btnNextone =findViewById(R.id.btnNextone)
        btnNextone.setOnClickListener {
            val intent =Intent(this,MemestwoActivity::class.java)
            startActivity(intent)
        }

        btnPrevone =findViewById(R.id.btnPrevone)
        btnPrevone.setOnClickListener {
            val intent =Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}