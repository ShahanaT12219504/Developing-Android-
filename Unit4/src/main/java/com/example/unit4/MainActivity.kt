package com.example.unit4

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val customEditText = findViewById<customEditText>(R.id.customEditText)
        val showButton = findViewById<Button>(R.id.showTextButton)
        val resultTextView = findViewById<TextView>(R.id.resultTextView)

        showButton.setOnClickListener {
            val text = customEditText.text.toString()
            if (text.isNotEmpty()) {
                resultTextView.text = "You entered: $text"
            } else {
                Toast.makeText(this, "Please enter some text", Toast.LENGTH_LONG).show()
            }
        }
    }
}