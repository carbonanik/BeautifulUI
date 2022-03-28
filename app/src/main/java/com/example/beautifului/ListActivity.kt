package com.example.beautifului

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import kotlinx.android.synthetic.main.activity_list.*

class ListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        supportActionBar?.title = "Movies"

        val navHostFragment = nav_host_fragment as NavHostFragment
        val navController = navHostFragment.navController
        navController.graph = navController.navInflater.inflate(R.navigation.list_nav_graph)
    }
}