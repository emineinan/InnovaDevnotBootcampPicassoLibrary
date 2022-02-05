package com.example.usingpicasso

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.usingpicasso.databinding.ActivityMainBinding
import com.squareup.picasso.Picasso

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        showImage("kofte.png")

        binding.buttonImageOne.setOnClickListener {
            showImage("ayran.png")
        }

        binding.buttonImageTwo.setOnClickListener {
            showImage("kadayif.png")
        }
    }

    private fun showImage(imageName: String) {
        val url = "http://kasimadalan.pe.hu/yemekler/resimler/$imageName"
        Picasso.get().load(url).into(binding.imageView)
    }
}