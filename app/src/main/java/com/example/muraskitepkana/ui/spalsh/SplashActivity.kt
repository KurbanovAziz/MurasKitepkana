package com.example.muraskitepkana.ui.spalsh

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.muraskitepkana.MainActivity
import com.example.muraskitepkana.R
import com.example.muraskitepkana.databinding.ActivitySplashBinding
import kotlinx.coroutines.*

@SuppressLint("CustomSplashScreen")
class SplashActivity : AppCompatActivity() {
    private val binding by viewBinding(ActivitySplashBinding::bind)
    private val uiScope = CoroutineScope(Dispatchers.Main + Job())
    private val ioScope = CoroutineScope(Dispatchers.IO + Job())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_splash)

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            window.setDecorFitsSystemWindows(false)
        }
        val fadeIn = AnimationUtils.loadAnimation(this, R.anim.fade_in)
        binding.logoLayout.startAnimation(fadeIn)
        binding.logoLayout.visibility = View.VISIBLE

        toMainActivity()
    }

    override fun onDestroy() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            window.setDecorFitsSystemWindows(true)
        }
        super.onDestroy()
    }

    private fun toMainActivity() {
        ioScope.launch {
            delay(1500)
            uiScope.launch {
                startActivity(Intent(this@SplashActivity, MainActivity::class.java))
                finish()
            }
        }
    }
}