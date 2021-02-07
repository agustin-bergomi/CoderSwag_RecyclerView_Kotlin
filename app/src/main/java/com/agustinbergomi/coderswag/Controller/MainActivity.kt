package com.agustinbergomi.coderswag.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import com.agustinbergomi.coderswag.Model.Category
import com.agustinbergomi.coderswag.R
import com.agustinbergomi.coderswag.Services.DataService

class MainActivity : AppCompatActivity() {
//adapter formado por un array de elementos de tipo "category"
    lateinit var adapter : ArrayAdapter<Category>
    lateinit var cate: ListView;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        cate = findViewById<ListView>(R.id.categoryListView)

        adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, DataService.categories)

        cate.adapter = adapter
    }
}