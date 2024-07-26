package com.example.ihead_beta

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.ihead_beta.databinding.ActivityMainSittingBinding
import java.util.Timer
import java.util.TimerTask

class MainActivitySitting : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainSittingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainSittingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val dialog = FragmentSitting()

        val timer = Timer()
        val timerTask = object : TimerTask(){
            override fun run() {
                dialog.show(supportFragmentManager, "FragmentSitting")
            }
        }

        timer.schedule(timerTask, 10000)

    }


}