package com.alura.bancoitau

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvList: RecyclerView
    private var adapter = MenuItemAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        iniciaViews()
        setItemList()
    }
    private fun iniciaViews(){
        rvList = findViewById(R.id.recycle_view_list)
        rvList.adapter = adapter
        rvList.layoutManager = GridLayoutManager(this, 2)
    }
    fun setItemList(){
        adapter.setItemList(
            arrayListOf(
                MenuItemModel(
                    "Cartoes"
                ),
                MenuItemModel(
                    "Invertimentos"
                ),
                MenuItemModel(
                    "Portabilidade de Salário"
                ),
                MenuItemModel(
                    "Cartoes"
                ),
                MenuItemModel(
                    "Invertimentos"
                ),
                MenuItemModel(
                    "Portabilidade de Salário"
                )
            )
        )
    }
}