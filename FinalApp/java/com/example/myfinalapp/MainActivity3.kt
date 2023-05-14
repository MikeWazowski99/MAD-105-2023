package com.example.myfinalapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        var nextButton3: Button = findViewById(R.id.btnFeedback)
        nextButton3.setOnClickListener {
            val intent3 = Intent(this, MainActivity4::class.java)
            startActivity(intent3)
    }
    }
}