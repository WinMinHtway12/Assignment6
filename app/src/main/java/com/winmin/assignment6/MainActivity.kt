package com.winmin.assignment6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.winmin.assignment6.model.Item
import com.winmin.assignment6.model.ItemAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var itemlist=ArrayList<Item>()
       itemlist.add(Item(R.drawable.list,"My Wishlist"))
        itemlist.add(Item(R.drawable.list,"My Followed Sellers"))
        itemlist.add(Item(R.drawable.wallet,"My Purchased Item"))
        itemlist.add(Item(R.drawable.creditcard,"My Coupons"))
        itemlist.add(Item(R.drawable.list,"My Cards Wallet"))
        itemlist.add(Item(R.drawable.list," Exp Points"))
        itemlist.add(Item(R.drawable.feedback,"My Given Feedbacks"))
        itemlist.add(Item(R.drawable.list,"Searched History"))
        itemlist.add(Item(R.drawable.calendar," Events & Calender"))

        var flowerAdapter= ItemAdapter(itemlist)
        recyclerView.layoutManager= GridLayoutManager(this,3)

        recyclerView.adapter=flowerAdapter
    }
}