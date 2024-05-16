package com.babak.recipesdummyjson.utils

import android.widget.ImageView
import com.babak.recipesdummyjson.R
import com.bumptech.glide.Glide

fun ImageView.imageLoad (url:String?){
    Glide
        .with(this)
        .load(url)
        .centerCrop()
        .placeholder(R.drawable.img)
        .into(this);
}

