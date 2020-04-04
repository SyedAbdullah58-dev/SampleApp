package com.example.codeswagger.Controller.CustomAdapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.codeswagger.Controller.Model.Product
import com.example.codeswagger.R

class ProductAdapter( val context:Context,val product:List<Product>) : RecyclerView.Adapter<ProductAdapter.ProductHolder>() {

    inner class ProductHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
val productImage=itemView.findViewById<ImageView>(R.id.productimage)
val productname=itemView.findViewById<TextView>(R.id.productName)
val productprice=itemView.findViewById<TextView>(R.id.productprice)
        fun ProuductBind(context: Context,product:Product){
val resourcrId=context.resources.getIdentifier(product.image,"drawable",context.packageName)
            productImage.setImageResource(resourcrId)
            productname.text=product.title
            productprice.text=product.price


        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductHolder {
val view=LayoutInflater.from(context).inflate(R.layout.prodcut_listview,parent,false)
        return ProductHolder(view)
    }

    override fun getItemCount(): Int {
     return product.count()
    }

    override fun onBindViewHolder(holder: ProductHolder, position: Int) {


            holder?.ProuductBind(context,product[position])

    }

}