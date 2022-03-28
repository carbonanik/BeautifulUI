package com.example.beautifului.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.CenterCrop
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.example.beautifului.R
import com.example.beautifului.databinding.ItemBinding
import com.example.beautifului.model.Movie

class ListAdapter(private val listItemClick: ListItemClick) :
    RecyclerView.Adapter<ListAdapter.ListViewHolder>() {

    private var mList = mutableListOf<Movie>()

    inner class ListViewHolder(private val view: ItemBinding) : RecyclerView.ViewHolder(view.root) {
        fun bind(movie: Movie) {
            view.movie = movie
            view.rounderBackground.setOnClickListener {
                listItemClick.onItemClick(
                    position = adapterPosition,
                    posterImage = view.posterImage,
                    roundedBackground = view.rounderBackground,
                    isFavorite = view.isFavorite,
                    movieTitle = view.movieTitle,
                    movieYear = view.movieYear,
                    directorName = view.directorName
                )
            }
            view.executePendingBindings()
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val b = DataBindingUtil.inflate<ItemBinding>(
            LayoutInflater.from(parent.context),
            R.layout.item,
            parent,
            false
        )
        return ListViewHolder(b)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        holder.bind(mList[position])
    }

    override fun getItemCount(): Int {
        return mList.size
    }

    fun setData(dl: List<Movie>) {
        mList.clear()
        mList.addAll(dl)
        notifyDataSetChanged()
    }

    fun addItem(position: Int = 0, movie: Movie) {
        mList.add(position, movie)
        notifyItemInserted(position)
    }

    fun removeItem(position: Int) {
        if (mList.size > position) {
            mList.removeAt(position)
            notifyItemRemoved(position)
        }
    }
}