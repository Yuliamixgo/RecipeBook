package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class DatalogActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_datalog)
        //val recipesList: RecyclerView = findViewById(R.id.listElements)
        //val recipe = arrayListOf<Recipes>()
        //recipe.add(Recipes(1, "borsch","Борщ", "ароматный густой красный суп с овощами и мясом, ставший символом славянской кухни.", 50))
       // recipe.add(Recipes(2, "ocroshka","Окрошка", "Традиционный холодный суп русской кухни, который готовят в весенне-летний период.", 30))

        //recipesList.layoutManager = LinearLayoutManager(this)
        //recipesList.adapter = ItemAdapter(recipe, this)
    }
    fun onClickGoSecond1(view: View) {
        val intent = Intent(this, Borch::class.java)
        startActivity(intent)
    }
    fun onClickGoSecond2(view: View) {
        val intent = Intent(this, Okroschka::class.java)
        startActivity(intent)
    }
    fun onClickGoSecond3(view: View) {
        val intent = Intent(this, Pizza::class.java)
        startActivity(intent)
    }
    fun onClickGoSecond4(view: View) {
        val intent = Intent(this, Mix::class.java)
        startActivity(intent)
    }
    fun onClickGoSecond5(view: View) {
        val intent = Intent(this, Cake::class.java)
        startActivity(intent)
    }
    fun onClickGoSecond6(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}