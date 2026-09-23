package com.example.helloworldapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.textView)

        val buttonChangeText =
            findViewById<Button>(R.id.buttonChangeText)

        buttonChangeText.setOnClickListener {
            textView.text = getString(R.string.button_clicked)
        }
    }
}