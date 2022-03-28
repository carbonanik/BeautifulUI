package com.example.beautifului.adapter

import android.view.animation.AnimationUtils
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.RecyclerView
import com.example.beautifului.R

class CustomItemAnimator : DefaultItemAnimator() {

    override fun animateAdd(holder: RecyclerView.ViewHolder?): Boolean {
        holder?.itemView?.animation = AnimationUtils.loadAnimation(
            holder?.itemView?.context,
            R.anim.viewholder_add_anim
        )
        return super.animateAdd(holder)
    }

    override fun animateRemove(holder: RecyclerView.ViewHolder?): Boolean {
        holder?.itemView?.animation = AnimationUtils.loadAnimation(
            holder?.itemView?.context,
            R.anim.viewholder_remove_anim
        )
        return super.animateRemove(holder)
    }

    override fun getAddDuration(): Long {
        return 500
    }

//    override fun getRemoveDuration(): Long {
//        return 500
//    }
}