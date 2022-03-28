package com.example.beautifului

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.FragmentNavigatorExtras
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.transition.TransitionInflater
import com.example.beautifului.adapter.CustomItemAnimator
import com.example.beautifului.adapter.ListItemClick
import com.example.beautifului.databinding.FragmentListBinding
import com.example.beautifului.viewmodel.ListViewModel

class ListFragment : Fragment(), ListItemClick {

    private val viewModel: ListViewModel by activityViewModels()
    private lateinit var viewBinding: FragmentListBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        viewBinding = FragmentListBinding.inflate(inflater, container, false)
//        viewBinding.viewModel = viewModel

        viewModel.setAdapter(this)
        viewBinding.movieListRv.layoutManager = LinearLayoutManager(activity)
        viewBinding.movieListRv.adapter = viewModel.getAdapter()
        viewBinding.movieListRv.itemAnimator = CustomItemAnimator()
        viewBinding.lifecycleOwner = this

//        sharedElementEnterTransition = TransitionInflater.from(this.context).inflateTransition(R.transition.chabge_bound_two)
        sharedElementReturnTransition = TransitionInflater
            .from(this.context)
            .inflateTransition(R.transition.chabge_bound_two)

        viewBinding.executePendingBindings()

        return viewBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        postponeEnterTransition()
        viewBinding.movieListRv.viewTreeObserver
            .addOnPreDrawListener {
                startPostponedEnterTransition()
                true
            }

        if (savedInstanceState == null){
            viewModel.getList()
//            viewModel.getNewsList()
        }
//        lifecycleScope.launch(Dispatchers.IO) {
//
//
//            val queue = Volley.newRequestQueue(activity)
//            val url = "http://newsapi.org/v2/everything?q=bitcoin&from=2020-10-26&sortBy=publishedAt&apiKey=9f83ce723c5948f8816a727d93c6fb70"
//
//            val stringRequest = StringRequest(Request.Method.GET, url, { response ->
//                println(response)
//            }, {
//                println("error")
//            })
//
//            queue.add(stringRequest)
//
//        }

        viewBinding.addButton.setOnClickListener {
            viewModel.addMovie()
        }

        viewBinding.removeButton.setOnClickListener {
            viewModel.removeMovie()
        }

        viewModel.listMovie.observe(viewLifecycleOwner, {
            if (it.isNotEmpty()) {
                viewModel.setList(it)
            }
        })
    }

    override fun onItemClick(
        position: Int,
        posterImage: ImageView,
        roundedBackground: ImageView,
        isFavorite: ImageView,
        movieTitle: TextView,
        movieYear: TextView,
        directorName: TextView,
    ) {
        if (position >= 0) {
            viewModel.singleOpenMovie.value = viewModel.listMovie.value?.get(position)

            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
                val extras = FragmentNavigatorExtras(
//                    viewBinding.addButton to "addButtonTN",
                    posterImage to posterImage.transitionName,
                    roundedBackground to roundedBackground.transitionName,
                    isFavorite to isFavorite.transitionName,
                    movieTitle to movieTitle.transitionName,
                    movieYear to movieYear.transitionName,
                    directorName to directorName.transitionName,
                )

                val action = ListFragmentDirections.actionListFragmentToSingleViewFragment()
                findNavController().navigate(action, extras)
//                getFragmentNavController(R.id.nav_host_fragment)?.navigate(action, extras)
            } else {
                findNavController().navigate(R.id.action_listFragment_to_singleViewFragment)
//                getFragmentNavController(R.id.nav_host_fragment)?.navigate(R.id.action_listFragment_to_singleViewFragment)
            }

        }
    }

//    private fun Fragment.getFragmentNavController(@IdRes id: Int) = activity?.let {
//        return@let Navigation.findNavController(it, id)
//    }

}