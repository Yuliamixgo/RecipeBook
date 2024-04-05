package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Mix : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mix)
    }
    fun onClickGoSecond7(view: View) {
        val intent = Intent(this, DatalogActivity::class.java)
        startActivity(intent)
    }
}