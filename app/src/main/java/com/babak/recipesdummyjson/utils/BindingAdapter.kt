package com.babak.recipesdummyjson.utils

import android.widget.ImageView
import androidx.databinding.BindingAdapter

@BindingAdapter("alican")
fun loadImage(imageView:ImageView,url:String?){
    imageView.imageLoad(url)
}