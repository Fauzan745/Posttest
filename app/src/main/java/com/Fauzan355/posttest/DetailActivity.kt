package com.Fauzan355.posttest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.bumptech.glide.Glide
// DELETE THIS LINE: import kotlinx.android.synthetic.main.activity_detail.*
import com.Fauzan355.posttest.databinding.ActivityDetailBinding // Add this import

class DetailActivity : AppCompatActivity() {

    // Declare the binding variable
    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Initialize the binding
        binding = ActivityDetailBinding.inflate(layoutInflater)
        // Set the content view to the binding's root
        setContentView(binding.root)

        val title = intent.getStringExtra("title")
        val date = intent.getStringExtra("date")
        val cover = intent.getStringExtra("cover")
        val desc = intent.getStringExtra("desc")

        // Access views using the binding object
        binding.txtDetailTitle.text = title
        binding.txtDetailDate.text = date
        binding.txtDetailDesc.text = desc

        Glide.with(this).load(cover).into(binding.imgDetail)
    }
}
