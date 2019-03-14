package com.example.frponsll40alumnes.runfish

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.databinding.DataBindingUtil
import com.example.frponsll40alumnes.runfish.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.buttonEnter.setOnClickListener{

        }
    }


}
