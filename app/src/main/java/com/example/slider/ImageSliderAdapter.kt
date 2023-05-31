package com.example.slider

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.smarteist.autoimageslider.SliderView
import com.smarteist.autoimageslider.SliderViewAdapter

class ImageSliderAdapter(private val imageList: ArrayList<Int>) :
    SliderViewAdapter<ImageSliderAdapter.ImageSliderViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup?): ImageSliderViewHolder {
        val view =
            LayoutInflater.from(parent?.context).inflate(R.layout.item_image_slider, parent, false)
        return ImageSliderViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: ImageSliderViewHolder?, position: Int) {
        viewHolder?.bind(imageList[position])
    }

    override fun getCount(): Int {
        return imageList.size
    }

    inner class ImageSliderViewHolder(itemView: View) : ViewHolder(itemView) {
        private val imageView: ImageView = itemView.findViewById(R.id.image_view)

        fun bind(imageResId: Int) {
            imageView.setImageResource(imageResId)
        }
    }
}

