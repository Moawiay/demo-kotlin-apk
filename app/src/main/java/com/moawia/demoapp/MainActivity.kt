package com.moawia.demoapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvCounter = findViewById<TextView>(R.id.tvCounter)
        val btnClick = findViewById<Button>(R.id.btnClick)
        val btnReset = findViewById<Button>(R.id.btnReset)

        btnClick.setOnClickListener {
            count++
            tvCounter.text = "Clicks: $count"
            Toast.makeText(this, "Tapped! Count: $count", Toast.LENGTH_SHORT).show()
        }

        btnReset.setOnClickListener {
            count = 0
            tvCounter.text = "Clicks: 0"
            Toast.makeText(this, "Counter reset to 0", Toast.LENGTH_SHORT).show()
        }
    }
}
