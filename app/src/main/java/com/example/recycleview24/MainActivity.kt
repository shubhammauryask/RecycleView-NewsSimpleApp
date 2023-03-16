package com.example.recycleview24

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var myRecyclerView : RecyclerView
    lateinit var newsArrayList: ArrayList<News>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

          myRecyclerView = findViewById(R.id.ReycleViwe)

        val  NewsImageArray = arrayOf(
            R.drawable.pic1,
             R.drawable.pic2,
            R.drawable.pic3,
            R.drawable.pic4,
            R.drawable.pic5,
            R.drawable.pic6,
            R.drawable.pic7
        )

        val NewsArrayHeding = arrayOf(

            "Natu Natu Win The Oscar in Best Song",
           "MARIA VAN STAPPEL PASSES HER CAMBRIDGE B2 EXAM WITH TOP MARKS!",
        "IPL STARTED ON 31ST MARCH WITH HIS FIRST MATCH",
            "THIS IPL IS LAST MATCH FOR MS DHONI",
            "UP GOVERMENT  USE JCB TO ACQUIRE LAND ",
            "ADANI HAVE loss  MoRE THEN 30% IN FEW WEEKS",
            " IN   TURKEY  EARTHQUAKE MARE THEN THE MAGNITUDE OF 4.5"

        )
        // TO set the how the item   inside  the RecycleView,verticlly scrlloing or horizontly scrolling,uniform grid
        myRecyclerView.layoutManager = LinearLayoutManager(this)
        newsArrayList = arrayListOf<News>()

        for (index in NewsImageArray.indices){
            val news = News(NewsArrayHeding[index],NewsImageArray[index])
            newsArrayList.add(news)
        }
        myRecyclerView.adapter = MyAdapter(newsArrayList,this)
    }
}