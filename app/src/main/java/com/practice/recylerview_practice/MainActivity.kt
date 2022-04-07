package com.practice.recylerview_practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    var itemList = arrayListOf<ItemData>(
        ItemData("BROOKS Aurora 5%", "5% (10만원 이상 구매 시, 최대 5,000원)", "2021.07.05~2021.07.13"),
        ItemData("VPPLEMENT 21 S/S 10%", "10만원 이상 구매 시, 최대 5,000원", "2021.07.05~2021.07.13"),
        ItemData("AX VIP FW'21 5%", "1원 이상 구매시 사용가능, 최대할인금액 100,000원", "2021.07.05~2021.07.13"),
        ItemData("AX VIP FW'21 5%", "1원 이상 구매시 사용가능, 최대할인금액 100,000원", "2021.07.05~2021.07.13"),
        ItemData("AX VIP FW'21 5%", "1원 이상 구매시 사용가능, 최대할인금액 100,000원", "2021.07.05~2021.07.13"),
        ItemData("AX VIP FW'21 5%", "1원 이상 구매시 사용가능, 최대할인금액 100,000원", "2021.07.05~2021.07.13"),
        ItemData("AX VIP FW'21 5%", "1원 이상 구매시 사용가능, 최대할인금액 100,000원", "2021.07.05~2021.07.13"),
        ItemData("AX VIP FW'21 5%", "1원 이상 구매시 사용가능, 최대할인금액 100,000원", "2021.07.05~2021.07.13"),
        ItemData("AX VIP FW'21 5%", "1원 이상 구매시 사용가능, 최대할인금액 100,000원", "2021.07.05~2021.07.13"),
        ItemData("AX VIP FW'21 5%", "1원 이상 구매시 사용가능, 최대할인금액 100,000원", "2021.07.05~2021.07.13"),
        ItemData("AX VIP FW'21 5%", "1원 이상 구매시 사용가능, 최대할인금액 100,000원", "2021.07.05~2021.07.13"),
        ItemData("AX VIP FW'21 5%", "1원 이상 구매시 사용가능, 최대할인금액 100,000원", "2021.07.05~2021.07.13"),
        ItemData("AX VIP FW'21 5%", "1원 이상 구매시 사용가능, 최대할인금액 100,000원", "2021.07.05~2021.07.13"),
        ItemData("AX VIP FW'21 5%", "1원 이상 구매시 사용가능, 최대할인금액 100,000원", "2021.07.05~2021.07.13"),
        ItemData("AX VIP FW'21 5%", "1원 이상 구매시 사용가능, 최대할인금액 100,000원", "2021.07.05~2021.07.13"),
        ItemData("AX VIP FW'21 5%", "1원 이상 구매시 사용가능, 최대할인금액 100,000원", "2021.07.05~2021.07.13"),
        ItemData("AX VIP FW'21 5%", "1원 이상 구매시 사용가능, 최대할인금액 100,000원", "2021.07.05~2021.07.13"),
        ItemData("AX VIP FW'21 5%", "1원 이상 구매시 사용가능, 최대할인금액 100,000원", "2021.07.05~2021.07.13"),
        ItemData("AX VIP FW'21 5%", "1원 이상 구매시 사용가능, 최대할인금액 100,000원", "2021.07.05~2021.07.13"),
        ItemData("AX VIP FW'21 5%", "1원 이상 구매시 사용가능, 최대할인금액 100,000원", "2021.07.05~2021.07.13"),
        ItemData("VPPLEMENT 21 S/S 10%", "10만원 이상 구매 시, 최대 5,000원", "2021.07.05~2021.07.13")


    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //테스트 디벨롭
        val mAdapter = RecycleAdapter(this, itemList)
        val recycleView = findViewById<RecyclerView>(R.id.mRecyclerView)
        recycleView.adapter = mAdapter


        // 구분선 넣기
        val dividerItemDecoration =
            DividerItemDecoration(recycleView.context, LinearLayoutManager(this).orientation)

        recycleView.addItemDecoration(dividerItemDecoration)



    }

}