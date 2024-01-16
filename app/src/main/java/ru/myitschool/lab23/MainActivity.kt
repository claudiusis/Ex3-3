package ru.myitschool.lab23

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import ru.myitschool.lab23.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var binding: ActivityMainBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val intent : Intent = Intent(this, MainActivity2::class.java)
        setContentView(binding!!.root)

        binding!!.content.getRandomNums.setOnClickListener{
            if (!binding!!.content.shapeParam.text.isEmpty()&&!binding!!.content.rateParam.text.isEmpty()){
                intent.putExtra("amount", binding!!.content.shapeParam.text.toString())
                startActivity(intent)
            }
        }
    }
}