package com.marinanitech.lojanovackap

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.marinanitech.lojanovackap.R.layout.activity_main


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bolsamedia = findViewById(R.id.bolsa) as Button
        bolsamedia.setOnClickListener {
            val paginaDoProduto = Intent(this, ProductDetails::class.java)
            startActivity(paginaDoProduto)
       }
    }
}