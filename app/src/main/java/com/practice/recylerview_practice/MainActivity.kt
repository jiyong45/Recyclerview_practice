package com.practice.recylerview_practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {


    private lateinit var adapter:RecycleAdapter //adapter객체 먼저 선언해주기!
    var itemList = arrayListOf<ItemData>{
        ItemData("BROOKS Aurora 5%", "5% (10만원 이상 구매 시, 최대 5,000원)", "2021.07.05~2021.07.13")
        ItemData("VPPLEMENT 21 S/S 10%", "10만원 이상 구매 시, 최대 5,000원", "2021.07.05~2021.07.13")
        ItemData("AX VIP FW'21 5%", "1원 이상 구매시 사용가능, 최대할인금액 100,000원", "2021.07.05~2021.07.13")
        ItemData("VPPLEMENT 21 S/S 10%", "10만원 이상 구매 시, 최대 5,000원", "2021.07.05~2021.07.13")
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //테스트 디벨롭
        val mAdapter = RecycleAdapter(this, itemList)
        mRecyclerView.adapter = mAdapter


    }

}