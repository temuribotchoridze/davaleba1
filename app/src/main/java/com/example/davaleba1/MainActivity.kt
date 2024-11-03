package com.example.davaleba1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var editText: EditText
    private lateinit var button: Button
    private lateinit var button2: Button
        var email: String=""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        editText=findViewById(R.id.editTextTextEmailAddress)
        button=findViewById(R.id.button)
        button2=findViewById(R.id.button2)
        button.setOnClickListener{
             email=editText.text.toString()



        }
        button2.setOnClickListener{
            val intent= Intent(this, ResultActivity::class.java)
            intent.putExtra("EMAIL",email)
            startActivity(intent)
        }
    }
}