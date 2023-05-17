package com.example.muraskitepkana.ui.library

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.muraskitepkana.R
import com.example.muraskitepkana.databinding.FragmentLibraryBinding
import com.example.muraskitepkana.ui.library.adapter.MainLibraryAdapter


class LibraryFragment : Fragment() {
    private var _binding: FragmentLibraryBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_library, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

}