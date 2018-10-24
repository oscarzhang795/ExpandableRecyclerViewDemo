package com.example.oscarzhang.expandablerecyclerviewdemo

import android.graphics.Bitmap
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class InnerAdapter(private val data: ArrayList<Bitmap>): RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private inner class ViewBody internal constructor(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, position: Int): RecyclerView.ViewHolder =
        ViewBody(LayoutInflater.from(parent.context).inflate(R.layout.body, parent, false))

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(p0: RecyclerView.ViewHolder, p1: Int) {

    }

}