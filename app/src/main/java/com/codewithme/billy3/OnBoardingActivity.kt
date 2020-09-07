package com.codewithme.billy3

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.viewpager.widget.ViewPager
import com.blogspot.atifsoftwares.animatoolib.Animatoo
import com.codewithme.billy3.adapter.OnBoardingViewPagerAdapter
import com.codewithme.billy3.model.OnBoardingData
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.activity_on_boarding_test.*

class OnBoardingActivity : AppCompatActivity() {

    var onBoardingViewPagerAdapter: OnBoardingViewPagerAdapter? = null
    var tabLayout: TabLayout? = null
    var onBoardingViewPager: ViewPager? = null
    var next: Button? = null
    var position = 0
    var sharedPreferences: SharedPreferences? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if(restorePrefData()){
            startActivity(Intent(applicationContext,LoginActivity::class.java))
            Animatoo.animateZoom(this)
            finish()

        }
        Animatoo.animateShrink(this)
        setContentView(R.layout.activity_on_boarding_test)

        tabLayout = findViewById(R.id.tab_indicator)
        next = findViewById(R.id.buttonNext)

        val onBoardingData: MutableList<OnBoardingData> = ArrayList()
        onBoardingData.add(OnBoardingData("pay Online","Pay for anything you buy by using only your phone. yes. do not give up be woderfull or some thing esle", R.drawable.on_boarding_screen_1))
        onBoardingData.add(OnBoardingData("Receipts","All you receipts in one place. do what ever makes you happy. don't give up", R.drawable.on_boarding_screen_2))
        onBoardingData.add(OnBoardingData("History","Summery of all the details of your expenditures. what are you saying> each and every details you curier is available write here", R.drawable.on_boarding_screen_3))

        setOnBoardingViewPagerAdapter(onBoardingData)

        position = onBoardingViewPager!!.currentItem

        next?.setOnClickListener {
                if(position < onBoardingData.size){
                    position++
                    onBoardingViewPager!!.currentItem = position
        }
            if (position == onBoardingData.size){
                savePrefData()
                val i = Intent(applicationContext,LoginActivity::class.java)
                startActivity(i)
                Animatoo.animateZoom(this)
                finish()
            }
    }
     tabLayout!!.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener{
         @SuppressLint("SetTextI18n")
         override fun onTabSelected(tab: TabLayout.Tab?) {
             position = tab!!.position
             if(tab.position == onBoardingData.size - 1){
                 next!!.text = "Get Started"
             }else{
                 next!!.text = "Next"
             }
         }

         override fun onTabUnselected(tab: TabLayout.Tab?) {

         }

         override fun onTabReselected(tab: TabLayout.Tab?) {

         }

     })

        textSkipIntro.setOnClickListener {
            Intent(applicationContext, LoginActivity::class.java).also {
                startActivity(it)
                Animatoo.animateZoom(this)
                finish()
            }
        }

    }


    private fun setOnBoardingViewPagerAdapter(onBoardingData: List<OnBoardingData>){
        onBoardingViewPager = findViewById(R.id.screenPager)
        onBoardingViewPagerAdapter = OnBoardingViewPagerAdapter(this, onBoardingData)
        onBoardingViewPager!!.adapter = onBoardingViewPagerAdapter
        tabLayout?.setupWithViewPager(onBoardingViewPager)
    }


    private fun savePrefData(){
        sharedPreferences = applicationContext.getSharedPreferences("pref",Context.MODE_PRIVATE)
        val editor: SharedPreferences.Editor = sharedPreferences!!.edit()
        editor.putBoolean("isFirstTimeRun",true)
        editor.apply()
    }

    private fun restorePrefData(): Boolean{
        sharedPreferences = applicationContext.getSharedPreferences("pref", Context.MODE_PRIVATE)
        return sharedPreferences!!.getBoolean("isFirstTimeRun",false)
    }

}