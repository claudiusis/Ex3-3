package ru.myitschool.lab23

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class RandomNumAdapter: RecyclerView.Adapter<RandomNumViewHolder>() {

    var numbers = listOf<RandomNumber>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RandomNumViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return RandomNumViewHolder(inflater.inflate(R.layout.view_item, parent, false))
    }

    override fun getItemCount() = numbers.size

    override fun onBindViewHolder(holder: RandomNumViewHolder, position: Int){
        holder.onBind(numbers[position])
    }
}