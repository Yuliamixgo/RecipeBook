package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Okroschka : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_okroschka)
    }
    fun onClickGoSecond7(view: View) {
        val intent = Intent(this, DatalogActivity::class.java)
        startActivity(intent)
    }
}