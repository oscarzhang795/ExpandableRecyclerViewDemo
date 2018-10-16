package com.example.oscarzhang.expandablerecyclerviewdemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showRecyclerFragment()
    }

    fun showRecyclerFragment() {
        val recyclerFragment = RecyclerFragment()
        supportFragmentManager.beginTransaction().replace(R.id.container, recyclerFragment, recyclerFragment::class.java.simpleName).commit()
    }
}
