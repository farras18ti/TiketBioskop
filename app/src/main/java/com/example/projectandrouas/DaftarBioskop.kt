package com.example.projectandrouas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class DaftarBioskop : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daftar_bioskop)
        val cinemaxxi = findViewById<View>(R.id.cinemaXXI) as Button
        cinemaxxi.setOnClickListener {
            val i = Intent(this@DaftarBioskop, TableCinema::class.java)
            startActivity(i)
        }

        val cgv = findViewById<View>(R.id.Cgv) as Button
        cgv.setOnClickListener {
            val i = Intent(this@DaftarBioskop, TableCgv::class.java)
            startActivity(i)
        }

        val cinepolis = findViewById<View>(R.id.Cinepolis) as Button
        cinepolis.setOnClickListener {
            val i = Intent(this@DaftarBioskop, TableCinepolis::class.java)
            startActivity(i)
        }

        val box = findViewById<View>(R.id.Box) as Button
        box.setOnClickListener {
            val i = Intent(this@DaftarBioskop, TableBoxMovie::class.java)
            startActivity(i)
        }
    }
}