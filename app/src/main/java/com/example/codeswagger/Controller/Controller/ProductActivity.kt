package com.example.codeswagger.Controller.Controller


import android.content.res.Configuration
import android.os.Bundle
import android.widget.GridLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.example.codeswagger.Controller.CustomAdapter.ProductAdapter
import com.example.codeswagger.Controller.Services.DataServices
import com.example.codeswagger.Controller.Utilities.EXTRA_Category
import com.example.codeswagger.R
import kotlinx.android.synthetic.main.product_view.*

class ProductActivity:AppCompatActivity(){
  lateinit var   myadapter:ProductAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.product_view)
        val bawa = intent.getStringExtra(EXTRA_Category)
     Toast.makeText(this,
         "you selected $bawa",Toast.LENGTH_LONG).show()
        myadapter= ProductAdapter(this,DataServices.getProduct(bawa))
ProductRecycler.adapter=myadapter
        val orientation=resources.configuration.orientation
        var spanCount=2
        if(orientation==Configuration.ORIENTATION_LANDSCAPE){
            spanCount=3

        }
        val Layoutmanager= GridLayoutManager(this,spanCount)
        ProductRecycler.layoutManager=Layoutmanager
        ProductRecycler.setHasFixedSize(true)

    }
}