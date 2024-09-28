package com.likobehruz.viewpager.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.viewpager.widget.PagerAdapter
import com.likobehruz.viewpager.R
import java.util.Objects

class MyAdapter:PagerAdapter() {
    override fun getCount(): Int {
        return 3
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
       return view==`object`
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        var itemView:View=LayoutInflater.from(container.context).inflate(R.layout.item_rv,container,false)
        var yosirbekimage=itemView.findViewById<ImageView>(R.id.image_yosirbek)

        when(position){
            0->yosirbekimage.setImageResource(R.drawable.img)
            1->yosirbekimage.setImageResource(R.drawable.img_1)
            2->yosirbekimage.setImageResource(R.drawable.img_2)
        }



        container.addView(itemView)

        return itemView
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View)
    }

}