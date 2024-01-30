package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.adapters.MyAdapter
import com.example.recyclerview.models.MyModel

class MainActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView
    lateinit var gridLayoutManager: GridLayoutManager
    lateinit var arrayList: ArrayList<MyModel>
    lateinit var thisAdapter: MyAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        gridLayoutManager = GridLayoutManager(applicationContext, 3,
                                              LinearLayoutManager.VERTICAL, false)
        recyclerView.layoutManager = gridLayoutManager
        recyclerView.setHasFixedSize(true)
        arrayList = setupData()
        thisAdapter = MyAdapter(applicationContext, arrayList)
        recyclerView.adapter = thisAdapter
    }

    private fun setupData(): ArrayList<MyModel>{
        var items: ArrayList<MyModel> = ArrayList()

        items.add(MyModel(R.drawable.lab_retriever, "Labrador Retriever"))
        items.add(MyModel(R.drawable.german_shepherd, "German Shepherd"))
        items.add(MyModel(R.drawable.golden_retriever, "Golden Retriever"))
        items.add(MyModel(R.drawable.bulldog, "Bulldog"))
        items.add(MyModel(R.drawable.beagle, "Beagle"))

        items.add(MyModel(R.drawable.poodle, "Poodle"))
        items.add(MyModel(R.drawable.rottweiler,"Rottweiler"))
        items.add(MyModel(R.drawable.siberian_husky, "Siberian Husky"))
        items.add(MyModel(R.drawable.boxer, "Boxer"))
        items.add(MyModel(R.drawable.dachshund, "Dachshund"))

        items.add(MyModel(R.drawable.shih_tzu, "Shih Tzu"))
        items.add(MyModel(R.drawable.yorkshire_terrier, "Yorkshire Terrier"))
        items.add(MyModel(R.drawable.chihuahua, "Chihuahua"))
        items.add(MyModel(R.drawable.great_dane, "Great Dane"))
        items.add(MyModel(R.drawable.dobermann, "Doberman Pinscher"))

        items.add(MyModel(R.drawable.australian_shepherd, "Australian Shepherd"))
        items.add(MyModel(R.drawable.border_collie, "Border Collie"))
        items.add(MyModel(R.drawable.shetland_sheepdog, "Shetland Sheepdog"))
        items.add(MyModel(R.drawable.saint_bernard, "Saint Bernard"))
        items.add(MyModel(R.drawable.shiba_inu, "Shiba Inu"))

        items.add(MyModel(R.drawable.cocker_spaniel, "Cocker Spaniel"))
        items.add(MyModel(R.drawable.pomeranian, "Pomeranian"))
        items.add(MyModel(R.drawable.minature_schnauzer, "Miniature Schnauzer"))
        items.add(MyModel(R.drawable.french_bulldog, "French Bulldog"))
        items.add(MyModel(R.drawable.maltese, "Maltese"))

        return  items
    }
}