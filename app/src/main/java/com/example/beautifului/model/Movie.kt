package com.example.beautifului.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Movie(
    var id : Int = -1,
    var name : String = "",
    var imgRes : Int = 0,
    var year : String = "",
    var director : String = "",
    var detail : String = "",
    var favourite : Boolean = false
) : Parcelable
