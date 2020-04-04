package com.example.codeswagger.Controller.Services

import android.graphics.drawable.Drawable
import com.example.codeswagger.Controller.Model.Category
import com.example.codeswagger.Controller.Model.Product

object DataServices {
    val categories= listOf(
        Category("SHIRTS","shirtimage"),
        Category("HOODIES","hoodieimage"),
        Category("HATS","hatimage"),
        Category("DIGITAL","digitalgoodsimage")
, Category("SHIRTS","shirtimage"),
        Category("HOODIES","hoodieimage"),
        Category("HATS","hatimage"),
        Category("DIGITAL","digitalgoodsimage")

    )
val hat= listOf(
    Product("Graphic Bean","200 Rs","hat1"),
    Product("Black Hat","450 Rs","hat2"),
    Product("White Hat","100 Rs","hat3"),
    Product("Snapback Hat","300 Rs","hat4")
)
    val hoodies= listOf(
        Product("Hoodie Gray","500Rs","hoodie1"),
        Product("Hoodie Red","300Rs","hoodie2"),
        Product("Hoodie Gray","500Rs","hoodie3"),
        Product("Hoodie Black","400Rs","hoodie4")

    )
    val shirts= listOf(
        Product("shirt Black","500Rs","shirt1"),
        Product("light Gray","300Rs","shirt2"),
        Product("Logo shirt Red ","500Rs","shirt3"),
        Product(" Hustle","400Rs","shirt4"),
        Product(" Kichflip studios","400Rs","shirt5")

    )
val digitalgoods= listOf<Product>()


    fun getProduct(category: String):List<Product>{
     return   when(category){
            "SHIRTS"->return shirts
            "HATS"->return hat
            "HOODIES"->return hoodies
            else->return digitalgoods
        }


    }

}