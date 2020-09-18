package com.codewithme.billy3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.blogspot.atifsoftwares.animatoolib.Animatoo
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        link_sign_up.setOnClickListener {
            startActivity(Intent(this, SignUpActivity::class.java))
            Animatoo.animateZoom(this)
        }

        link_forgot_password.setOnClickListener {
            startActivity(Intent(this, ForgotPasswordActivity::class.java))
            Animatoo.animateZoom(this)

        }

    }
}