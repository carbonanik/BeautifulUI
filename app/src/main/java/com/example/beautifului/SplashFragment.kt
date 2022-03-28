package com.example.beautifului

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.fragment.FragmentNavigatorExtras
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import com.example.beautifului.databinding.FragmentSplashBinding
import kotlinx.android.synthetic.main.fragment_splash.*


class SplashFragment : Fragment() {

    private val SPLASH_TIME_OUT: Long = 3000
    private lateinit var binding: FragmentSplashBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSplashBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        animateNavigate(view)
    }

    private fun animateNavigate(view: View) {
        logo_image.setOnClickListener {
            val extras = FragmentNavigatorExtras(
                logo_image to getString(R.string.transition_logo_image),
                app_name to getString(R.string.transition_app_name)
            )
            val action = SplashFragmentDirections.actionSplashFragmentToLoginFragment()
            NavHostFragment.findNavController(this).navigate(action, extras)
        }
    }
}