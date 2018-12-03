package com.example.user.movierateapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class RateMovie : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rate_movie)


        }

    override fun onBackPressed() {
        val intent = Intent(this, ViewMovie::class.java)
        startActivity(intent)
        super.onBackPressed()
    }
}


