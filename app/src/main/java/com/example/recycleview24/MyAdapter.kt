package com.example.recycleview24

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

import com.google.android.material.imageview.ShapeableImageView


class MyAdapter(var newsArrayList: ArrayList<News>, var context:Activity):
RecyclerView.Adapter<MyAdapter.MyViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {//if layoutManager fail to load viewHten it
    //ask  onCreatViewholder method  to Creat View useing viewHolder
     val itemView = LayoutInflater.from(parent.context).inflate(R.layout.each_row,parent,false)
        return MyViewHolder(itemView)
    }

    override fun getItemCount(): Int {  // No of  Itemprasent in your array
        return newsArrayList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {//data ko load karta hai//populate item with data
      val currentItem =  newsArrayList[position]
        holder.htitle.text= currentItem.NewsHeading
        holder.hImage.setImageResource(currentItem.NewsImage)
    }
    //it hold view so thst view are not created every Time so memory can be saved
    class MyViewHolder(view  : View): RecyclerView.ViewHolder(view) {
       val htitle  =  itemView.findViewById<TextView>(R.id.headingTitle)
        val hImage = itemView.findViewById<ShapeableImageView>(R.id.headingImage)
    }


}