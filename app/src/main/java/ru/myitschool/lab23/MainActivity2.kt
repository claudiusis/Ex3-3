package ru.myitschool.lab23

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import ru.myitschool.lab23.databinding.ActivityMain2Binding
import java.util.Random

class MainActivity2 : AppCompatActivity() {

    private var binding: ActivityMain2Binding? = null
    private lateinit var recyclerView: RecyclerView

    private fun generateList(n: Int): List<RandomNumber> {
        return buildList {
            for (i in 1..n) {
                add(RandomNumber(Random().nextDouble()))
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding!!.root)

        recyclerView = binding!!.generatedList
        val linearlayout = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        val adapter = RandomNumAdapter()
        Log.i("QWERTY", intent.extras!!.get("amount").toString())
        adapter.numbers = generateList(intent.extras!!.get("amount").toString().toInt())
        recyclerView.layoutManager = linearlayout
        recyclerView.adapter = adapter
    }
}