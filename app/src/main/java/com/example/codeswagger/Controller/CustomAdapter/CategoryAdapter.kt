package com.example.codeswagger.Controller.CustomAdapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.example.codeswagger.Controller.Model.Category
import com.example.codeswagger.R
import org.w3c.dom.Text

class CategoryAdapter(context:Context,categories:List<Category>) : BaseAdapter() {
    val context=context
    val categories=categories
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
val categoryView: View
        val holder: ViewHolder
        if(convertView==null)
        {
            categoryView=LayoutInflater.from(context).inflate(R.layout.category_list,null)
            holder= ViewHolder()
            holder.categoryImage=categoryView.findViewById(R.id.catimage)
            holder.categoryName=categoryView.findViewById(R.id.catName)
            categoryView.tag=holder


println("hye first time")
        }
        else
        {
            holder=convertView.tag as ViewHolder
            categoryView=convertView
            println("lets go")
        }



        val category=categories[position]
        val resouceid=context.resources.getIdentifier(category.image,"drawable",context.packageName)
        holder.categoryImage?.setImageResource(resouceid)
        holder.categoryName?.text=category.title

        return categoryView
    }

    override fun getItem(position: Int): Any {
return categories[position]
    }

    override fun getItemId(position: Int): Long {
return 0
    }

    override fun getCount(): Int {
return categories.count()
    }


}
private class ViewHolder{
var categoryImage:ImageView?=null
    var categoryName:TextView?=null

}