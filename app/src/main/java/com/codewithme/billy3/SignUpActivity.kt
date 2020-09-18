package com.codewithme.billy3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.activity.OnBackPressedCallback
import com.blogspot.atifsoftwares.animatoolib.Animatoo
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_sign_up.*

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

//        @Override
//        fun onBackPressed(){
//            super.onBackPressed()
//            startActivity(Intent(this, LoginActivity::class.java))
//            Animatoo.animateFade(this)
//        }

        btn_cancel_in_sign_up.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
            Animatoo.animateFade(this)
        }

//        btn_next_in_sign_up.setOnClickListener {
//            startActivity(Intent(this, DirectSelectorActivity::class.java))
//            Animatoo.animateZoom(this)
//
//        }

    }

}