package com.example.reportezapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(private val userList : ArrayList<User>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.useritem, parent,false)
        return MyViewHolder(itemView)

    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        val user = userList[position]
        holder.Name.text=user.name
        holder.ps.text=user.ps
        holder.pnumber.text=user.pnumber
        holder.crime.text=user.crime
        holder.brief.text=user.brief
    }

    override fun getItemCount(): Int {

        return userList.size
    }


    class MyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){

        val Name: TextView = itemView.findViewById(R.id.editText61)
        val ps : TextView = itemView.findViewById(R.id.editText71)
        val pnumber : TextView = itemView.findViewById(R.id.editText21)
        val crime : TextView= itemView.findViewById(R.id.editText13)
        val brief : TextView= itemView.findViewById(R.id.editText22)


    }

}