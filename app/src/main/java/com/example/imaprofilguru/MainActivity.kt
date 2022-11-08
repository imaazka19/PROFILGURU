package com.example.imaprofilguru

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn= findViewById<Button>(R.id.ok)
        val btn1= findViewById<Button>(R.id.y)

        btn.setOnClickListener {
            val Intent = Intent(this, MainActivity3::class.java)
            startActivity(Intent)

        }
        btn1.setOnClickListener {
            val Intent = Intent(this, MainActivity2::class.java)
            startActivity(Intent)

        }
    }
}