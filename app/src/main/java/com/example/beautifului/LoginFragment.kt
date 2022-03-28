package com.example.beautifului

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.transition.TransitionInflater

class LoginFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        sharedElementEnterTransition = TransitionInflater.from(this.context).inflateTransition(R.transition.chabge_bound_two)
        sharedElementReturnTransition = TransitionInflater.from(this.context).inflateTransition(R.transition.chabge_bound_two)
        return inflater.inflate(R.layout.fragment_login, container, false)
    }
}