package com.example.pemensanantiket

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.pemensanantiket.databinding.ActivityHomepagesBinding

class homepages : AppCompatActivity() {
    private lateinit var binding: ActivityHomepagesBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityHomepagesBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        with(binding){
            button.setOnClickListener{
                val intentFillform = Intent(this@homepages, fillform::class.java)
                startActivity(intentFillform)
            }
        }
    }
}