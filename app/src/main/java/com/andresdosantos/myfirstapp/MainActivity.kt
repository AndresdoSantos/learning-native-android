package com.andresdosantos.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

private var number = 0

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val titleTextView = findViewById<TextView>(R.id.title)

        val incrementButton =  findViewById<Button>(R.id.incrementButton)

        val decrementButton =  findViewById<Button>(R.id.decrementButton)

        incrementButton.setOnClickListener {
            number++
            titleTextView.text = "$number"
        }

        decrementButton.setOnClickListener {
            number--
            titleTextView.text = "$number"
        }
    }
}