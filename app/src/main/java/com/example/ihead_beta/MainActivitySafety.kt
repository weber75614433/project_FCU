package com.example.ihead_beta

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.ihead_beta.databinding.ActivityMainSafetyBinding
import java.util.Timer
import java.util.TimerTask

class MainActivitySafety : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainSafetyBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainSafetyBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val dialog = FragmentSafety()

        val timer = Timer()
        val timerTask = object : TimerTask(){
            override fun run() {
                dialog.show(supportFragmentManager, "FragmentSafety")
            }
        }

        timer.schedule(timerTask, 10000)

    }


}