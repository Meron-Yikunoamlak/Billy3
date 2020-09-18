package com.codewithme.billy3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import com.blogspot.atifsoftwares.animatoolib.Animatoo
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputLayout
import com.hbb20.CountryCodePicker
import kotlinx.android.synthetic.main.activity_forgot_password.*

class ForgotPasswordActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)
    }

    fun verifyPhoneNumber(view: View) {
        startActivity(Intent(this, MakeSelectionActivity::class.java))
//        Animatoo.animateSwipeRight(this);

    }
}

