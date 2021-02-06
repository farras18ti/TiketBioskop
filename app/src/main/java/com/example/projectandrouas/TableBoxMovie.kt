package com.example.projectandrouas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_table_box_movie.*

class TableBoxMovie : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_table_box_movie)

        WW.setOnClickListener {
            startActivity(Intent(this, Jadwal::class.java))
        }

        Dillan.setOnClickListener {
            startActivity(Intent(this, Jadwal::class.java))
        }
    }

}