package com.example.oscarzhang.expandablerecyclerviewdemo

import android.content.Context
import android.graphics.Bitmap
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.TypedValue
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.header.view.*


class RecyclerAdapter(private val dataSet: ArrayList<String>): RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private inner class viewHeader internal constructor(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var isCollapsed = true

        fun rvResize() {

        }

        fun rvSize() {

        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder =
            viewHeader(LayoutInflater.from(parent.context).inflate(R.layout.header, parent, false))

    override fun getItemCount(): Int = dataSet.size

    override fun onBindViewHolder(viewholder: RecyclerView.ViewHolder, position: Int) {
        (viewholder as viewHeader).itemView.dummyText.text = dataSet[position]

        viewholder.itemView.layoutParams.height = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 70.toFloat(), viewholder.itemView.context.resources.displayMetrics).toInt()


        viewholder.itemView.innerRecycler.layoutManager = GridLayoutManager(viewholder.itemView.context, 3)
        viewholder.itemView.innerRecycler




        viewholder.itemView.frameContainer.setOnClickListener {

        }
    }




}