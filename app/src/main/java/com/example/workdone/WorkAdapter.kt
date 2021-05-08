package com.example.workdone

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class WorkAdapter(private var wDataSet: MutableList<WorkDetail>):RecyclerView.Adapter<WorkAdapter.ViewHolder>(){
    class ViewHolder internal constructor(itemView: View):
            RecyclerView.ViewHolder(itemView){
        val workTitle:TextView=itemView.findViewById(R.id.workTitle)
        val personName:TextView=itemView.findViewById(R.id.personName)
        val phoneNumber:TextView=itemView.findViewById(R.id.phoneNumber)
        val timeStamp:TextView=itemView.findViewById(R.id.timeStamp)
        val information:TextView=itemView.findViewById(R.id.information)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.work_item,parent,false) as View
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return wDataSet.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.workTitle.text=wDataSet[position].title
        holder.personName.text=wDataSet[position].name
        holder.phoneNumber.text=wDataSet[position].number
        holder.timeStamp.text=wDataSet[position].timestamp
        holder.information.text=wDataSet[position].info
        holder.itemView.setOnClickListener(){
            val intent= Intent(holder.itemView.context,WorkDetailActivity::class.java)
            holder.itemView.context.startActivity(intent)
        }
    }
}