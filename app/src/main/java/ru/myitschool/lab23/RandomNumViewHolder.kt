package ru.myitschool.lab23

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RandomNumViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    private val data = itemView.findViewById<TextView>(R.id.random_number_result)

    fun onBind(randomNumber: RandomNumber) {
        data.text = randomNumber.dataText.toString()
    }
}