package com.makino.harutiro.work1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_nextgamen.*

class nextgamen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nextgamen)

        exit.setOnClickListener {
            val mainpage = Intent (this,MainActivity::class.java)
            startActivity(mainpage)
            finish()
        }
    }
}