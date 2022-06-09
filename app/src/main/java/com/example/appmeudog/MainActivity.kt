package com.example.appmeudog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.appmeudog.databinding.ActivityMainBinding
import com.example.appmeudog.model.mockDogs

class MainActivity : AppCompatActivity() {

    private  val binding by lazy{
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val dogListAdapter = DogItemAdapter()
        binding.dogListRecyclerView.adapter = dogListAdapter
        dogListAdapter.submitList(mockDogs())
    }
}