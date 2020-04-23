package com.example.tp1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val validate = findViewById<Button>(R.id.validateButton)
        validate.setOnClickListener {
            val name = findViewById<TextInputLayout>(R.id.nameInput).editText?.text.toString().trim()
            val following = findViewById<EditText>(R.id.following)?.text.toString().trim()
            val follower = findViewById<EditText>(R.id.follower)?.text.toString().trim()

            if (name.isNullOrBlank() || following.isNullOrBlank() || follower.isNullOrBlank()) {
                println("Veuillez renseigner les informations nécessaires.")
            } else {
                println(name + "|" + following + "|" + follower)
            }
        }
    }
}
