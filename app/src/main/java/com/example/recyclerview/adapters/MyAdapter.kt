package com.example.recyclerview.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.R
import com.example.recyclerview.models.MyModel

class MyAdapter(val context: Context, val arrayList: ArrayList<MyModel>):
    RecyclerView.Adapter<MyAdapter.ItemHolder>() {

    class ItemHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val ico = itemView.findViewById<ImageView>(R.id.imageView)
        val txt = itemView.findViewById<TextView>(R.id.textView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        val itemHolder = LayoutInflater.from(parent.context).inflate(R.layout.grid_item, parent, false)
        return ItemHolder(itemHolder)
    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
        val myCard: MyModel = arrayList.get(position)
        holder.ico.setImageResource(myCard.icoCard!!)
        holder.txt.text = myCard.txtCard

        holder.txt.setOnClickListener{
            Toast.makeText(context, myCard.txtCard, Toast.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }
}