package com.example.beautifului.util

import android.content.res.ColorStateList
import android.graphics.Color
import android.widget.ImageView
import androidx.core.widget.ImageViewCompat
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.load.resource.bitmap.BitmapTransitionOptions.withCrossFade
import com.bumptech.glide.load.resource.bitmap.CenterCrop
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.transition.DrawableCrossFadeFactory
import com.example.beautifului.R
import kotlin.math.min
import kotlin.math.roundToInt


@BindingAdapter("app:isFavourite")
fun setIsFavourite(imageView: ImageView, isFavourite: Boolean) {
    if (isFavourite) {
        ImageViewCompat.setImageTintList(imageView,
            ColorStateList.valueOf(Color.parseColor("#FF797A")))
    } else {
        ImageViewCompat.setImageTintList(imageView,
            ColorStateList.valueOf(Color.LTGRAY))
    }
}

@BindingAdapter(value = ["app:roundedCornerImage", "app:shadeBackground"], requireAll = false)
fun setRoundedCornerImage(imageView: ImageView, resInt: Int, backId: Int?) {
    if (resInt != 0) {

        val factory = DrawableCrossFadeFactory.Builder().setCrossFadeEnabled(true).build()

        Glide.with(imageView.context)
            .asBitmap()
            .load(resInt)
            .transition(withCrossFade(factory))
            .diskCacheStrategy(DiskCacheStrategy.ALL)
            .placeholder(R.drawable.container_bg)
//            .listener(object : RequestListener<Bitmap?> {
//                override fun onLoadFailed(
//                    e: GlideException?,
//                    model: Any?,
//                    target: Target<Bitmap?>?,
//                    isFirstResource: Boolean,
//                ): Boolean {
//                    return false
//                }
//
//                override fun onResourceReady(
//                    resource: Bitmap?,
//                    model: Any?,
//                    target: Target<Bitmap?>?,
//                    dataSource: DataSource?,
//                    isFirstResource: Boolean,
//                ): Boolean {
//                    if (resource != null) {
//                        println(resource)
//                        val palette: Palette = Palette.from(resource).generate()
//                        if (backId != null) {
//                            println(backId)
//                            val backView = imageView.rootView.findViewById<ImageView>(backId)
//                            println(backView)
//                            if (backView != null) {
//                                val color = palette.lightVibrantSwatch?.rgb
//                                if (color != null) {
//                                    println(color)
//                                    ImageViewCompat.setImageTintList(backView,
//                                        ColorStateList.valueOf(color))
//                                }
//                            }
//                        }
//                    }
//                    return false
//                }
//
//            })
            .transform(CenterCrop(), RoundedCorners(12))
            .into(imageView)
    }
}

fun manipulateColor(color: Int, factor: Float): Int {
    val a: Int = Color.alpha(color)
    val r = (Color.red(color) * factor).roundToInt()
    val g = (Color.green(color) * factor).roundToInt()
    val b = (Color.blue(color) * factor).roundToInt()
    return Color.argb(a,
        min(r, 255),
        min(g, 255),
        min(b, 255))
}