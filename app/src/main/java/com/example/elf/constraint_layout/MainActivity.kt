package com.example.elf.constraint_layout

import android.graphics.Typeface
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.content.res.ResourcesCompat
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var typeFace: Typeface? = ResourcesCompat.getFont(this.applicationContext, R.font.light)
        music.setTypeface(typeFace,Typeface.NORMAL)


        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this,LinearLayout.HORIZONTAL,false)

        val users = ArrayList<model>()
        users.add(model(R.drawable.peace,"Peace"))
        users.add(model(R.drawable.energise,"Energise"))
        users.add(model(R.drawable.create,"Create"))
        users.add(model(R.drawable.peace,"Peace"))
        users.add(model(R.drawable.energise,"Energise"))
        users.add(model(R.drawable.create,"Create"))


        val adapter = AdapterForCategories(users)
        recyclerView.adapter = adapter


        val pagerAdapter = pagerAdapter(supportFragmentManager)
        viewpager.adapter = pagerAdapter
        tab_layout.setupWithViewPager(viewpager)

    }
}

