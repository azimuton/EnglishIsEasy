package com.azimuton.englishiseasy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.Window
import com.azimuton.englishiseasy.databinding.ActivityMainBinding
import com.azimuton.englishiseasy.fragments.*
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var  binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val w: Window = window
        w.decorView.systemUiVisibility = (View.SYSTEM_UI_FLAG_HIDE_NAVIGATION // скрываем нижнюю панель навигации
                or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY) //появляется поверх активити и исчезает
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.ivCloseApplication.setOnClickListener { finishAffinity() }
        binding.tvTimer.text = System.currentTimeMillis().toString()

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
}