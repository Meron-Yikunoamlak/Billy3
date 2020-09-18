package com.codewithme.billy3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.blogspot.atifsoftwares.animatoolib.Animatoo

class SuccessPasswordResetActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_success_password_reset)

        val topToDown = AnimationUtils.loadAnimation(this,R.anim.top_to_down)
        val scaleToBig = AnimationUtils.loadAnimation(this,R.anim.scale_to_big)
        val bottomToUp = AnimationUtils.loadAnimation(this,R.anim.bottom_to_up)
        val bottomToUp2 = AnimationUtils.loadAnimation(this,R.anim.bottom_to_up2)

        val successScreenTitle = findViewById<TextView>(R.id.success_message_title)
        val successScreenIcon = findViewById<ImageView>(R.id.success_message_icon)
        val successScreendesc = findViewById<TextView>(R.id.success_message_description)
        val successScreenbtn = findViewById<Button>(R.id.success_message_btn)

        successScreenTitle.startAnimation(topToDown)
        successScreenIcon.startAnimation(scaleToBig)
        successScreendesc.startAnimation(bottomToUp)
        successScreenbtn.startAnimation(bottomToUp2)
    }

    fun backToLogin(view: View) {
        startActivity(Intent(this, LoginActivity::class.java))
        Animatoo.animateWindmill(this)
        finish()}
}