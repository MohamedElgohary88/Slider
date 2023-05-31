package com.example.slider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.smarteist.autoimageslider.SliderView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageList = ArrayList<Int>()
        imageList.add(R.drawable.grapes_4)
        imageList.add(R.drawable.fruit)
        imageList.add(R.drawable.orange_3)
        imageList.add(R.drawable.pineapple_6)


        val imageSlider = findViewById<SliderView>(R.id.imageSlider)
        val adapter = ImageSliderAdapter(imageList)
        imageSlider.setSliderAdapter(adapter)
        imageSlider.startAutoCycle()
    }
}