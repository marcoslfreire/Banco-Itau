package com.alura.bancoitau

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MenuItemAdapter(): RecyclerView.Adapter<MenuItemAdapter.MenuAdapterViewHoder>() {
    private val list = mutableListOf<MenuItemModel>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuAdapterViewHoder {
        val View = LayoutInflater.from(parent.context).inflate(R.layout.item_menu, parent, false)
        return MenuAdapterViewHoder(View)
    }

    override fun onBindViewHolder(holder: MenuAdapterViewHoder, position: Int) {
        holder.iniciaViews(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }

    fun setItemList(list: List<MenuItemModel>){
        this.list.clear()
        this.list.addAll(list)

    }
    class MenuAdapterViewHoder(itemView: View): RecyclerView.ViewHolder(itemView){
        private val recycleViewTitle by lazy {
            itemView.findViewById<TextView>(R.id.recycle_view_list)
        }
        fun iniciaViews(item: MenuItemModel){
            recycleViewTitle.text = item.titulo

        }
    }
}