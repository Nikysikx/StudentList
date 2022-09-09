package com.example.myapplication.presentation

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.domain.StudentItem


class MyAdapter : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    var list = listOf<StudentItem>()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layout = when (viewType) {
            GIRL -> R.layout.item_girl
            BOY -> R.layout.item_boy
            else -> {throw Exception("")}
        }
        val view = LayoutInflater.from(parent.context).inflate(layout, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: MyViewHolder, position: Int) {
        val studentItem = list[position]

        viewHolder.tvName.text = studentItem.name

        viewHolder.view.setOnClickListener {
            viewHolder.textView.text = studentItem.name + " " + studentItem.gender
        }
        }

    override fun getItemCount(): Int {
      return list.size
    }

    override fun getItemViewType(position: Int): Int {
        val studentItem = list[position]
        return if (studentItem.gender == "girl") {
            GIRL
        } else {
            BOY
        }
    }

    class MyViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        val tvName = view.findViewById<TextView>(R.id.tv_name)
        val tvGender = view.findViewById<TextView>(R.id.tv_gender)
        val textView = view.findViewById<TextView>(R.id.textView123)
    }

    companion object {
        val GIRL = 1
        val BOY = 0
    }
}