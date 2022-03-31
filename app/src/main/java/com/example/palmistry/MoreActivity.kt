package com.example.palmistry

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.palmistry.databinding.ActivityMainBinding
import com.example.palmistry.databinding.MoreBinding

class MoreActivity : AppCompatActivity() {


private lateinit var binding: MoreBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = MoreBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


    }


}