package com.greensky0526.viewpagerpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2

class MainActivity : AppCompatActivity() {

    lateinit var viewPager_aespa: ViewPager2



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewPager_aespa.adapter = MyViewPagerAdapter(getIdolList()) // 어댑터 생성
        viewPager_aespa.orientation = ViewPager2.ORIENTATION_HORIZONTAL // 방향을 가로로
    }

    // 뷰 페이저에 들어갈 아이템
    private fun getIdolList(): ArrayList<Int> {
        return arrayListOf<Int>(
            R.drawable.giselle,
            R.drawable.karina,
            R.drawable.winter,
            R.drawable.ningning)
    }
}