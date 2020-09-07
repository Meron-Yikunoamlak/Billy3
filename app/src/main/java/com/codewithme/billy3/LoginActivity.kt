package com.codewithme.billy3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.blogspot.atifsoftwares.animatoolib.Animatoo
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_sign_up.view.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        link_sign_up.setOnClickListener {
            startActivity(Intent(this, SignUpActivity::class.java))
            Animatoo.animateZoom(this)
        }

        link_forgot_password.setOnClickListener {
            startActivity(Intent(this, ForgotPasswodActivity::class.java))
            Animatoo.animateZoom(this)

        }

    }
}