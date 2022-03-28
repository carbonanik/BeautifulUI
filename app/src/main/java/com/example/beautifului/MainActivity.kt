package com.example.beautifului

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.ActivityNavigator
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment

class MainActivity : AppCompatActivity() {

    lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navController = (supportFragmentManager.findFragmentById(R.id.nav_host_fragment_main) as NavHostFragment).navController
        navController.graph = navController.navInflater.inflate(R.navigation.register_nav_graph)

    }

//    override fun finish() {
//        super.finish()
//        ActivityNavigator.applyPopAnimationsToPendingTransition(this)
//    }
}