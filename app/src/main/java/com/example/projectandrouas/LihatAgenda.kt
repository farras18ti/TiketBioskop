package com.example.projectandrouas

import android.database.Cursor
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

open class LihatAgenda : AppCompatActivity() {

    protected var cursor: Cursor? = null
    var dbHelper: DataHelper? = null
    var ton2: Button? = null
    var text1: TextView? = null
    var text2: TextView? = null
    var text3: TextView? = null
    var text4: TextView? = null
    var text5: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lihat_agenda)
        dbHelper = DataHelper(this)
        text1 = findViewById<View>(R.id.textView1) as TextView
        text2 = findViewById<View>(R.id.textView2) as TextView
        text3 = findViewById<View>(R.id.textView3) as TextView
        text4 = findViewById<View>(R.id.textView4) as TextView
        text5 = findViewById<View>(R.id.textView5) as TextView

        val db = dbHelper!!.readableDatabase
        cursor = db.rawQuery(
            "SELECT * FROM agenda WHERE nama_agenda = '" +
                    intent.getStringExtra("nama_agenda") + "'", null
        )

//        cursor =
//            db.rawQuery("SELECT * FROM agenda WHERE ${intent.getStringExtra("nama_agenda")} ", null)

        cursor.moveToFirst()
        if (cursor.getCount() > 0) {
            cursor.moveToPosition(0)
            text1!!.text = cursor.getString(0).toString()
            text2!!.text = cursor.getString(1).toString()
            text3!!.text = cursor.getString(2).toString()
            text4!!.text = cursor.getString(3).toString()
            text5!!.text = cursor.getString(4).toString()
        }
        ton2 = findViewById<View>(R.id.button1) as Button
        ton2!!.setOnClickListener { // TODO Auto-generated method stub
            finish()
        }
    }
}