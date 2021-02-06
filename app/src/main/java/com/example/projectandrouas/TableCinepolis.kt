package com.example.projectandrouas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_table_box_movie.*
import kotlinx.android.synthetic.main.activity_table_cinepolis.*

class TableCinepolis : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_table_cinepolis)

        dgb.setOnClickListener {
            startActivity(Intent(this, Jadwal::class.java))
        }

        mariposa.setOnClickListener {
            startActivity(Intent(this, Jadwal::class.java))
        }
    }
}