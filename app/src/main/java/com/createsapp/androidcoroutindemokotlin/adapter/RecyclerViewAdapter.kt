package com.createsapp.androidcoroutindemokotlin.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.createsapp.androidcoroutindemokotlin.R
import com.createsapp.androidcoroutindemokotlin.model.CategoryItem

class RecyclerViewAdapter: RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder>() {

    var items = ArrayList<CategoryItem>()

    fun setUpdateData(items: ArrayList<CategoryItem>) {
        this.items = items
        notifyDataSetChanged()
    }
    class MyViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val name = view.findViewById<TextView>(R.id.name)
        fun bind(data : CategoryItem){
            name.text = data.category_name
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item,parent,false);
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return items.size
    }


    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(items.get(position))
    }



}