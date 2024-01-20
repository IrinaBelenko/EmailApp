package com.example.emailapp

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sendButton = findViewById<Button>(R.id.ButtonSend)
        sendButton.setOnClickListener {

            val email = findViewById<com.google.android.material.textfield.TextInputEditText>(R.id.email).text.toString()
            val subject = findViewById<com.google.android.material.textfield.TextInputEditText>(R.id.subject).text.toString()
            val message = findViewById<com.google.android.material.textfield.TextInputEditText>(R.id.message).text.toString()
            val emails = arrayOf(email)

            val intent = Intent(Intent.ACTION_SEND).apply {
                type = "text/plain"
                putExtra(Intent.EXTRA_EMAIL, emails)
                putExtra(Intent.EXTRA_SUBJECT, subject)
                putExtra(Intent.EXTRA_TEXT, message)
            }
            startActivity(intent)
    }}
}