package com.example.beautifului.adapter

import android.widget.ImageView
import android.widget.TextView

interface ListItemClick {
    fun onItemClick(
        position: Int,
        posterImage: ImageView,
        roundedBackground: ImageView,
        isFavorite: ImageView,
        movieTitle: TextView,
        movieYear: TextView,
        directorName: TextView,
    )
}