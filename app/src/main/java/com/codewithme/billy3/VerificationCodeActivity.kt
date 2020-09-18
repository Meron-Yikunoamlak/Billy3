package com.codewithme.billy3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.blogspot.atifsoftwares.animatoolib.Animatoo

class VerificationCodeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verification_code)
    }

    fun callPasswordResetScreenFromOTP(view: View) {
        startActivity(Intent(this, PasswordResetActivity::class.java))
        Animatoo.animateSlideLeft(this)
        finish()
    }
}