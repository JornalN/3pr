package com.example.f6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer

class LoadScreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_load_screen)
        var countDownTimer = object : CountDownTimer(2000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                val inten = Intent(this@LoadScreenActivity, MainActivity::class.java)
                startActivity(inten)
                finish()
            }
            override fun onFinish() {

            }
        }
        countDownTimer.start()
    }
}