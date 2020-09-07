package com.codewithme.billy3.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.viewpager.widget.PagerAdapter
import com.codewithme.billy3.R
import com.codewithme.billy3.model.OnBoardingData
import org.w3c.dom.Text

class OnBoardingViewPagerAdapter(
    private var context: Context, private var onBoardingDataList: List<OnBoardingData>) : PagerAdapter() {

    override fun getCount(): Int {
        return onBoardingDataList.size
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
       return view == `object`
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {

        container.removeView(`object` as View)
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {

        val view = LayoutInflater.from(context).inflate(R.layout.on_boarding_screen_layout,null)

        val imageView = view.findViewById<ImageView>(R.id.image)
        val title = view.findViewById<TextView>(R.id.title)
        val description = view.findViewById<TextView>(R.id.description)

        imageView.setImageResource(onBoardingDataList[position].image)
        title.text = onBoardingDataList[position].title
        description.text = onBoardingDataList[position].description

        container.addView(view)
        return view
    }
}