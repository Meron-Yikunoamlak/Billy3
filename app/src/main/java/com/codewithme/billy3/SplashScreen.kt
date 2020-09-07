package com.codewithme.billy3

import android.app.ActivityOptions
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.ImageView
import androidx.core.app.ActivityCompat
import androidx.core.app.ActivityOptionsCompat
import androidx.core.graphics.alpha
import androidx.core.view.ViewCompat
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_splash_screen.*

class SplashScreen : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

//                val imageView = findViewById<ImageView>(R.id.img_logo)
//                val transitionName = ViewCompat.getTransitionName(imageView)
//                val intent = Intent(this, LoginActivity::class.java)
//                val options = ActivityOptionsCompat.makeSceneTransitionAnimation(
//                    this, imageView, "logo")
//                imageView.postDelayed({ ActivityCompat.startActivity(this@SplashScreen, intent, options.toBundle())
//                    finish() }, 1000)


        img_logo.alpha = 0f
        img_logo.animate().setDuration(3000).alpha(1f).withEndAction{
            val i = Intent(this,OnBoardingActivity::class.java)

            startActivity(i)
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)
            finish()

        }


    }
}