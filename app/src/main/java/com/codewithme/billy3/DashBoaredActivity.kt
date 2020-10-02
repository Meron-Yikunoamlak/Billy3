package com.codewithme.billy3

import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import com.codewithme.billy3.fragments.ProfileFragment
import com.codewithme.billy3.fragments.RecieptFragment
import com.codewithme.billy3.fragments.WalletFragment
import com.ismaeldivita.chipnavigation.ChipNavigationBar

class DashBoaredActivity : AppCompatActivity() {
    private val container by lazy { findViewById<View>(R.id.container) }
    private val title by lazy { findViewById<TextView>(R.id.title) }
    private val menu by lazy { findViewById<ChipNavigationBar>(R.id.bottom_menu) }

    private val walletFragment = WalletFragment()
    private val recieptFragment = RecieptFragment()
    private val profileFragment = ProfileFragment()

    private var lastColor: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dash_boared)

            makeCurrentFragment(walletFragment)
              menu.setItemSelected(R.id.wallet)

        menu.setOnItemSelectedListener { id ->
            val option = when (id) {

                R.id.receipt -> makeCurrentFragment(recieptFragment)
                R.id.profile -> makeCurrentFragment(profileFragment)
                else -> makeCurrentFragment(walletFragment)
            }
        }
    }


    private fun makeCurrentFragment(fragment: Fragment) =
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fl_wrapper,fragment)
            commit()
        }
}