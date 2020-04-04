package com.example.codeswagger.Controller.Controller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.codeswagger.Controller.CustomAdapter.CustomRecyclerView
import com.example.codeswagger.Controller.Services.DataServices
import com.example.codeswagger.Controller.Utilities.EXTRA_Category
import com.example.codeswagger.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var myadapter:CustomRecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    myadapter=CustomRecyclerView(this,DataServices.categories){
        category ->Toast.makeText(this," you selected  ${category.title}",Toast.LENGTH_LONG).show()
val myintent=Intent(this,ProductActivity::class.java)
        myintent.putExtra(EXTRA_Category,category.title)
        startActivity(myintent)
    }

        ProductRecycler.adapter=myadapter
        println("meradapter  : ${myadapter}")
val linearbawa=LinearLayoutManager(this)
ProductRecycler.layoutManager=linearbawa
        ProductRecycler.setHasFixedSize(true)
    }

}
