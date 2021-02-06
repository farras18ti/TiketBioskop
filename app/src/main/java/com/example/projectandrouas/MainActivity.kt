package com.example.projectandrouas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var userName: String? = null
    var pass_: String? = null
    var dbcenter: DataHelper? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        dbcenter = DataHelper(this)
        val username = findViewById<View>(R.id.txUsername) as EditText
        val password = findViewById<View>(R.id.txPassword) as EditText
        val login = findViewById<View>(R.id.btnLogin) as Button
        login.setOnClickListener {
            userName = username.text.toString()
            pass_ = password.text.toString()
            if (userName == "admin" && pass_ == "admin") {
                val status: Status = Status.instance
                status.status = "admin"
                val datas: String = status.status
                Toast.makeText(
                    applicationContext,
                    "Username dan Password benar Anda berhasil Login",
                    Toast.LENGTH_SHORT
                ).show()
                val i = Intent(this@MainActivity, Jadwal::class.java)
                startActivity(i)
            } else {
                Toast.makeText(
                    applicationContext,
                    "Username dan Pssword tidak sesuai Anda gagal Login",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }

        tvCreatAccount.setOnClickListener{
            startActivity(Intent(this, RegisterActivity::class.java))
        }
    }
}
