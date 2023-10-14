package com.example.myquizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn : Button = findViewById(R.id.btn1)
        val etname:EditText = findViewById(R.id.etname)
        btn.setOnClickListener {
      if(etname.text.isEmpty()){
          Toast.makeText(this,"enter your name bro????",Toast.LENGTH_LONG).show()
      }
            else{
              val intent = Intent(this,questions::class.java)
          startActivity(intent)
          finish()
      }
        }


    }


}