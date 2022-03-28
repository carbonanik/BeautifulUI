package com.example.beautifului.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.beautifului.R
import com.example.beautifului.adapter.ListAdapter
import com.example.beautifului.adapter.ListItemClick
import com.example.beautifului.model.Article
import com.example.beautifului.model.Movie
import com.example.beautifului.repository.DataRepo

class ListViewModel: ViewModel() {
    private val dataRepo = DataRepo()
    private lateinit var adapter: ListAdapter

    val listMovie: LiveData<List<Movie>>
        get() = dataRepo.movieList

    val singleOpenMovie = MutableLiveData<Movie>().apply { value = Movie() }

    fun setAdapter(click: ListItemClick){
        if (!(this::adapter.isInitialized)){
            adapter = ListAdapter(click)
        }
    }

    fun getAdapter(): ListAdapter {
        return adapter
    }

    fun getList(){
        dataRepo.getMovieList()
    }

    fun setList(dl : List<Movie>){
        adapter.setData(dl)
    }

    fun addMovie() {
        val movie =         Movie(
            id = 11,
            name = "Bhat De",
            year = "1984",
            director = "Amjad Hossain",
            imgRes = R.drawable.vat_de,
            favourite = false,
            detail = "Bhat De is a Bangladeshi film, released in 1984. The film was edited, written and directed by Amjad Hossain. The film starred Alamgir, Shabana in the lead roles and co-starred Wasimul Bari Rajib, Anwar Hossain and more."
        )
        adapter.addItem(1, movie)
    }

    fun removeMovie(){
        adapter.removeItem(1)
    }
}