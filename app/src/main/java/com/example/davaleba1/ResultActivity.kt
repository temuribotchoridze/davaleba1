package com.example.davaleba1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ResultActivity : AppCompatActivity() {
    private lateinit var textview2: TextView
    private lateinit var button: Button
    private lateinit var editText: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_result)
        textview2=findViewById(R.id.textView2)
        val email=intent.getStringExtra("EMAIL")
        textview2.text=email
        button=findViewById(R.id.button3)
        editText=findViewById(R.id.editTextNumber)
        button.setOnClickListener{
            val input=editText.text.toString()
            if(input.isNotBlank()){
                val number=input.toIntOrNull()
                if(number!=null){
                    val result=number*2
                    editText.setText(result.toString())
                }else {
                    editText.setText(0)
                }
            }
        }
    }
}