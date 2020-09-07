package com.codewithme.billy3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

import android.graphics.Color
import android.graphics.Typeface
import android.graphics.drawable.ColorDrawable
import android.view.ViewGroup
import kotlinx.android.synthetic.main.activity_sign_up2.*

class SignUpActivity2 : AppCompatActivity() {


    private val accountType = arrayOf("Customer", "Cashier", "Business owner")
    private val bankAccountName = arrayOf("CBE Birr", "Amole", "Hello Cash", "MBirr", "Enat")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up2)


        val context = this

        // list of spinner items
        val userAccountTypes = mutableListOf(
            "Customer",
            "Cashier",
            "Business Owner"
        )

        // add a hint to spinner
        // list first item will show as hint
        userAccountTypes.add(0, "User Account Type")

        // initialize an array adapter for spinner
        val adapter: ArrayAdapter<String> = object : ArrayAdapter<String>(
            context,
            android.R.layout.simple_spinner_dropdown_item,
            userAccountTypes
        ) {
            override fun getDropDownView(
                position: Int,
                convertView: View?,
                parent: ViewGroup
            ): View {
                val view: TextView =
                    super.getDropDownView(position, convertView, parent) as TextView
                // set item text bold
                view.setTypeface(view.typeface, Typeface.BOLD)

                // set selected item style
                if (position == spinner.selectedItemPosition && position != 0) {
                    view.background = ColorDrawable(Color.parseColor("#00ACC1"))
                    view.setTextColor(Color.parseColor("#333399"))
                }

                // make hint item color gray
                if (position == 0) {
                    view.setTextColor(Color.LTGRAY)
                }

                return view
            }

            override fun isEnabled(position: Int): Boolean {
                // disable first item
                // first item is display as hint
                return position != 0
            }
        }

        // finally, data bind spinner with adapter
        spinner.adapter = adapter




        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                if (spinner.selectedItemPosition == 0) {
                    customerAccountTypeSelected()
                }
                if (spinner.selectedItemPosition == 1) {
                    cashierAccountTypeSelected()
                }
                if (spinner.selectedItemPosition == 2) {
                    businessOwnerAccountTypeSelected()
                }
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }


    }

    private fun customerAccountTypeSelected() {
        Toast.makeText(this, "selected Item " + spinner.selectedItem, Toast.LENGTH_SHORT).show()
    }

    private fun cashierAccountTypeSelected() {
        Toast.makeText(this, "selected Item " + spinner.selectedItem, Toast.LENGTH_SHORT).show()
    }

    private fun businessOwnerAccountTypeSelected() {
        Toast.makeText(this, "selected Item " + spinner.selectedItem, Toast.LENGTH_SHORT).show()
    }


}




















//
//    // spinner on item selected listener
//    spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
//        override fun onItemSelected(
//            parent: AdapterView<*>,
//            view: View,
//            position: Int,
//            id: Long
//        ) {
//            // by default spinner initial selected item is first item
//            if (position != 0){
//                textView.text = "Selected: "
//                // get selected item text
//                textView.append(parent.getItemAtPosition(position).toString())
//            }
//        }
//
//        override fun onNothingSelected(parent: AdapterView<*>?) {
//            // another interface callback
//        }
//    }
//}
//}
