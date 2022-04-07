package com.practice.recylerview_practice

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import java.util.*

class RecycleAdapter(private val context: Context, private val dataList: ArrayList<ItemData>):RecyclerView.Adapter<RecycleAdapter.ItemViewHolder>() {
    inner class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        private val itemTitle = itemView.findViewById<TextView>(R.id.title)
        private val itemSubtitle = itemView.findViewById<TextView>(R.id.subTitle)
        private val itemDescript = itemView.findViewById<TextView>(R.id.descript)

        fun bind(itemData: ItemData, context: Context){
            itemTitle?.text = itemData.title
            itemSubtitle?.text = itemData.subTitle
            itemDescript?.text = itemData.descript
            itemView.setOnClickListener {
                Toast.makeText(itemView.context, "test >> ${itemData?.title}", Toast.LENGTH_SHORT).show()
            }
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType:Int): ItemViewHolder{
        val view = LayoutInflater.from(context).inflate(R.layout.recycle_item, parent, false)
        return ItemViewHolder(view)
    }
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int){
        holder.bind(dataList[position], context)
        val layoutParams = holder.itemView.layoutParams
        layoutParams.height = 320
        holder.itemView.requestLayout()
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

}