package com.example.workdone

import android.content.Intent
import android.graphics.drawable.ClipDrawable.HORIZONTAL
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class ListActivity : AppCompatActivity() {
    private var wDataSet:MutableList<WorkDetail> = mutableListOf()
    private lateinit var layoutManager: RecyclerView.LayoutManager
    private lateinit var adapter:WorkAdapter
    private lateinit var recyclerView: RecyclerView
    private lateinit var addButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        //Dummy data for Midpoint submission

        wDataSet.add(WorkDetail("123","Name1","Information1","Title1",false,"PhoneNumber1","Time1","Keys"))
        wDataSet.add(WorkDetail("233","Name2","Information2","Title2",false,"PhoneNumber2","Time2","Keys"))
        wDataSet.add(WorkDetail("223","Name3","Information3","Title3",false,"PhoneNumber3","Time3","Keys"))
        wDataSet.add(WorkDetail("423","Name4","Information4","Title4",false,"PhoneNumber4","Time4","Keys"))
        wDataSet.add(WorkDetail("523","Name5","Information5","Title5",false,"PhoneNumber5","Time5","Keys"))
        wDataSet.add(WorkDetail("623","Name6","Information6","Title6",false,"PhoneNumber6","Time6","Keys"))
        wDataSet.add(WorkDetail("723","Name7","Information7","Title7",false,"PhoneNumber7","Time7","Keys"))
        wDataSet.add(WorkDetail("823","Name8","Information8","Title8",false,"PhoneNumber8","Time8","Keys"))
        wDataSet.add(WorkDetail("923","Name9","Information9","Title9",false,"PhoneNumber9","Time9","Keys"))
        wDataSet.add(WorkDetail("103","Name10","Information10","Title10",false,"PhoneNumber10","Time10","Keys"))



        recyclerView=findViewById(R.id.recyclerview)
        val itemDecor = DividerItemDecoration(this, HORIZONTAL)
        recyclerView.addItemDecoration(itemDecor)
        layoutManager=LinearLayoutManager(this)
        adapter= WorkAdapter(wDataSet)
        recyclerView.adapter=adapter
        recyclerView.layoutManager=layoutManager

        addButton=findViewById(R.id.addButton)
        addButton.setOnClickListener(){
            val intent= Intent(this,AddActivity::class.java)
            startActivity(intent)
        }
    }
}