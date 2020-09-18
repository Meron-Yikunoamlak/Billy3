package com.codewithme.billy3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.blogspot.atifsoftwares.animatoolib.Animatoo

class PasswordResetActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_password_reset)
    }

    fun callSuccessScreen(view: View) {
        startActivity(Intent(this, SuccessPasswordResetActivity::class.java))
        Animatoo.animateSlideLeft(this)
        finish()
    }
}