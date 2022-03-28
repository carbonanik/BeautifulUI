package com.example.beautifului

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.ViewModelProvider
import androidx.transition.TransitionInflater
import com.example.beautifului.databinding.FragmentSingleViewBinding
import com.example.beautifului.viewmodel.ListViewModel


class SingleViewFragment : Fragment() {

    private val viewModel: ListViewModel by activityViewModels()
    private lateinit var binding: FragmentSingleViewBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentSingleViewBinding.inflate(inflater, container, false)
        binding.viewModel = viewModel
        binding.lifecycleOwner = this

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        sharedElementEnterTransition = TransitionInflater.from(this.context).inflateTransition(R.transition.chabge_bound_two)
//        sharedElementReturnTransition = TransitionInflater.from(this.context).inflateTransition(R.transition.chabge_bound_two)
        binding.executePendingBindings()

    }
}