package com.example.todo

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import org.jetbrains.anko.intentFor
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.toast

class SplashScreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        startActivity<MainActivity>()
        finish()

    }
}