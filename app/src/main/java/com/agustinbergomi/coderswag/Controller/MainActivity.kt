package com.agustinbergomi.coderswag.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Adapter
import android.widget.ArrayAdapter
import android.widget.ListView
import com.agustinbergomi.coderswag.Adapters.CategoryAdapter
import com.agustinbergomi.coderswag.Model.Category
import com.agustinbergomi.coderswag.R
import com.agustinbergomi.coderswag.Services.DataService

class MainActivity : AppCompatActivity() {

//adapter formado por un array de elementos de tipo "category"
    lateinit var adapter : CategoryAdapter
    lateinit var categoryListView : ListView
//    lateinit var cate: ListView;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        categoryListView = findViewById<ListView>(R.id.categoryListView)

//        cate = findViewById<ListView>(R.id.categoryListView)

        //a la variable adapter le asigno un Constructor de tipo ArrayAdapter que toma como parametros
        //creo un objeto de tipo ArrayAdapter?
        adapter = CategoryAdapter(this, DataService.categories)
        categoryListView.adapter = adapter
//        cate.adapter = adapter
    }
}