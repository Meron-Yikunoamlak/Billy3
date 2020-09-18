package com.codewithme.billy3

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.blogspot.atifsoftwares.animatoolib.Animatoo
import kotlinx.android.synthetic.main.activity_make_selection.*
import kotlinx.android.synthetic.main.activity_verification_code.*

class MakeSelectionActivity : AppCompatActivity() {
    var viaEmailBtn: Button? = null
    var viaSmsBtn: Button? = null
    var otp_phone_or_email: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_make_selection)


        val topToDown = AnimationUtils.loadAnimation(this, R.anim.top_to_down)
        val pushLeftIn = AnimationUtils.loadAnimation(this, R.anim.push_left_in)
        val pushLeftIn2 = AnimationUtils.loadAnimation(this, R.anim.push_left_in2)
        val pushLeftOut = AnimationUtils.loadAnimation(this, R.anim.push_left_out)

        val makeSelectionTitle = findViewById<TextView>(R.id.tv_make)
        val makeSelectionDes = findViewById<TextView>(R.id.textView2)
        val viaSms = findViewById<ConstraintLayout>(R.id.constraintLayout)
        val viaEmail = findViewById<ConstraintLayout>(R.id.constraintLayout2)

        makeSelectionTitle.startAnimation(topToDown)
        makeSelectionDes.startAnimation(topToDown)
        viaSms.startAnimation(pushLeftIn)
        viaEmail.startAnimation(pushLeftIn2)

    }

//        viaSmsBtn?.setOnClickListener {
//            otp_phone_or_email!!.text = "+251965149323"
//            startActivity(Intent(this, VerificationCodeActivity::class.java))
//        }
//        viaEmailBtn?.setOnClickListener {
//            otp_phone_or_email!!.text = "meronikunoamlak1@gmail.com"
//            startActivity(Intent(this, VerificationCodeActivity::class.java))
//        }


//    @SuppressLint("SetTextI18n")
//    fun callOTPScreenFromSelectionViaSms(view: View) {
//        viaSmsBtn?.setOnClickListener {
//            otp_phone_or_email = findViewById(R.id.otp_phone_or_email)
//            otp_phone_or_email!!.text = "+251965149323"
//            startActivity(Intent(this, VerificationCodeActivity::class.java))
//        }
//    }
//    @SuppressLint("SetTextI18n")
//    fun callOTPScreenFromSelectionViaEmail(view: View) {
//        viaSmsBtn?.setOnClickListener {
//            otp_phone_or_email = findViewById(R.id.otp_phone_or_email)
//            otp_phone_or_email!!.text = "meronikunoamlak1@gmail.com"
//            startActivity(Intent(this, VerificationCodeActivity::class.java))
//        }
//    }


    fun callOTPScreenFromMakeSelection(view: View) {
        viaSmsBtn = findViewById(R.id.btn_via_sms)
        viaEmailBtn = findViewById(R.id.btn_via_email)
        otp_phone_or_email = findViewById(R.id.otp_phone_or_email)

        if (view.id.equals(viaSmsBtn)) {
            otp_phone_or_email!!.text = "+251965149323"

        }
        if (view.id.equals(viaEmailBtn)) {
            otp_phone_or_email!!.text = "meronyikunoamlak1@gmail.com"
        }

        startActivity(Intent(this, VerificationCodeActivity::class.java))
        Animatoo.animateSlideLeft(this)

    }

}