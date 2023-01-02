package com.example.lemonade_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lemonade_app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var counter = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.imgInfo.setOnClickListener { updateUI() }
        binding.imgInfo.setOnLongClickListener {
            resetUI()
            true
        }
    }

    private fun resetUI() {
        counter = 0
        updateUI()
    }

    private fun updateUI() {
        when(counter){
            0 ->{
                binding.imgInfo.setImageResource(R.drawable.lemon_tree)
                binding.textMsg.text = getString(R.string.lemon_select)
                counter++
            }
            1 ->{
                binding.imgInfo.setImageResource(R.drawable.lemon_squeeze)
                binding.textMsg.text = getString(R.string.lemon_squeeze)
                counter++
            }
            2 ->{
                binding.imgInfo.setImageResource(R.drawable.lemon_drink)
                binding.textMsg.text = getString(R.string.lemon_drink)
                counter++
            }
            3 ->{
                binding.imgInfo.setImageResource(R.drawable.lemon_restart)
                binding.textMsg.text = getString(R.string.lemon_empty_glass)
            }
        }
    }
}