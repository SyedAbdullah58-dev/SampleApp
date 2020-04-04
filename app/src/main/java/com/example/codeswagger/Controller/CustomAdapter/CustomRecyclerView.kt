package com.example.codeswagger.Controller.CustomAdapter

import android.content.Context
import android.view.ContextMenu
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.codeswagger.Controller.Model.Category
import com.example.codeswagger.R
import org.w3c.dom.Text

class CustomRecyclerView(val contex: Context ,val  categories:List<Category>, val itemClick:(Category) ->Unit   ) : RecyclerView.Adapter<CustomRecyclerView.Holder>() {

    inner class Holder(itemView: View,itemClick: (Category) -> Unit) : RecyclerView.ViewHolder(itemView) {
val categoryImage=itemView.findViewById<ImageView>(R.id.catimage)
val categoryName=itemView.findViewById<TextView>(R.id.catName)
fun bindCategory(category:Category,context:Context){
    val resourceid=context.resources.getIdentifier(category.image,"drawable",context.packageName)
categoryImage.setImageResource(resourceid)
    categoryName.text=category.title
itemView.setOnClickListener{
    itemClick(category)

}

}

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
val view =LayoutInflater.from(contex).inflate(R.layout.category_list,parent,false)

return Holder(view,itemClick)
    }

    override fun getItemCount(): Int {
return categories.count()
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
holder.bindCategory(categories[position],contex)
    }

}