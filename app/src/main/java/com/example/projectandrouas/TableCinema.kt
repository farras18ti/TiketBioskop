package com.example.projectandrouas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_table_box_movie.*
import kotlinx.android.synthetic.main.activity_table_cinema.*

class TableCinema : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_table_cinema)

        ts.setOnClickListener {
            startActivity(Intent(this, Jadwal::class.java))
        }

        mp.setOnClickListener {
            startActivity(Intent(this, Jadwal::class.java))
        }
    }
}