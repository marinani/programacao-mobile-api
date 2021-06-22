package com.marinanitech.lojanovackap

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent

class ProductDetails : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_details)

       val login = findViewById(R.id.login) as Button
        login.setOnClickListener{
            val login = Intent(this, Login::class.java)
            startActivity(login)
       }

    }
}