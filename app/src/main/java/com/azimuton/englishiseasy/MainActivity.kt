package com.azimuton.englishiseasy


import android.os.Build
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.Window
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import com.azimuton.englishiseasy.databinding.ActivityMainBinding
import com.azimuton.englishiseasy.fragments.*
import com.bumptech.glide.Glide
import dagger.hilt.android.AndroidEntryPoint
import java.util.*


@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var  binding : ActivityMainBinding
    private var seconds = 0
    private var running = false

    @RequiresApi(Build.VERSION_CODES.Q)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val w: Window = window
        w.decorView.systemUiVisibility = (View.SYSTEM_UI_FLAG_HIDE_NAVIGATION // скрываем нижнюю панель навигации
                or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY) //появляется поверх активити и исчезает
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        running = true
        runTimer()

        binding.ivCloseApplication.setOnClickListener { finishAffinity() }

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.flMain, LearnFragment())
            .commit()

        binding.llLearn.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.flMain, LearnFragment())
                .commit()
        }

        binding.llLearned.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.flMain, LearnedFragment())
                .commit()

        }
        binding.llWrite.setOnClickListener{
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.flMain, WriteFragment())
                .commit()
        }
        binding.llTranslate.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.flMain, TranslaterFragment())
                .commit()
        }
        binding.llFrasals.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.flMain, FrasalsFragment())
                .commit()
        }
        binding.llNewWords.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.flMain, NewWordsFragment())
                .commit()
        }
        binding.llNews.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.flMain, NewsFragment())
                .commit()
        }
    }
    override fun onResume() {
        super.onResume()
        val w: Window = window
        w.decorView.systemUiVisibility = (View.SYSTEM_UI_FLAG_HIDE_NAVIGATION // скрываем нижнюю панель навигации
                or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY) //появляется поверх активити и исчезает
    }
    private fun runTimer() {
        val handler = Handler()
        handler.post(object : Runnable {
            override fun run() {
                val hours = seconds / 3600
                val minutes = seconds % 3600 / 60
                val secs = seconds % 60
                val time = String.format(
                    Locale.getDefault(),
                    "%d:%02d:%02d", hours,
                    minutes, secs
                )
                binding.tvTimer.text = time
                if (running) {
                    seconds++
                }
                handler.postDelayed(this, 1000)
            }
        })
    }
}