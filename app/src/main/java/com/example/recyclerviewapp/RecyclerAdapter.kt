package com.example.recyclerviewapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter:RecyclerView.Adapter<RecyclerAdapter.ViewHolder>()
{
    private var texts= arrayOf("text1","text2","text3" ,"text4","text6,text7")
    private var images= arrayOf(R.drawable.ic_launcher_foreground,R.drawable.ic_launcher_foreground,R.drawable.ic_launcher_foreground,R.drawable.ic_launcher_foreground,R.drawable.ic_launcher_foreground,R.drawable.ic_launcher_foreground,R.drawable.ic_launcher_foreground)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapter.ViewHolder {
       val v=LayoutInflater.from(parent.context).inflate(R.layout.card_layout,parent,false)
     return ViewHolder(v)

    }

    override fun onBindViewHolder(holder: RecyclerAdapter.ViewHolder, position: Int) {
    holder.txtv.text=texts[position]
    holder.itimg.setImageResource(images[position])
    }

    override fun getItemCount(): Int {
return texts.size
    }
    inner class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
var itimg: ImageView
var txtv: TextView
init {
    itimg=itemView.findViewById(R.id.itimg)
    txtv=itemView.findViewById(R.id.txtv)

}

    }
}