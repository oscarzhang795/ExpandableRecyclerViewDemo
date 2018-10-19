package com.example.oscarzhang.expandablerecyclerviewdemo

import android.graphics.Bitmap
import android.support.v7.widget.RecyclerView
import android.view.ViewGroup

class InnerAdapter(private val data: ArrayList<Bitmap>): RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, position: Int): RecyclerView.ViewHolder {
        
    }

    override fun getItemCount(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onBindViewHolder(p0: RecyclerView.ViewHolder, p1: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}