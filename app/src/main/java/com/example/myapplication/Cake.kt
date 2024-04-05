package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Cake : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cake)
    }
    fun onClickGoSecond7(view: View) {
        val intent = Intent(this, DatalogActivity::class.java)
        startActivity(intent)
    }
}