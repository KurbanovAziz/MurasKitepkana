package com.example.muraskitepkana.ui.profile

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.navigation.fragment.findNavController
import com.example.muraskitepkana.R
import com.example.muraskitepkana.databinding.FragmentProfileBinding
import com.example.muraskitepkana.ui.profile.adapter.BookAdapter

class ProfileFragment : Fragment() {
    private lateinit var binding: FragmentProfileBinding
    private lateinit var adapter: BookAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        adapter = BookAdapter()
    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentProfileBinding.inflate(inflater, container, false)
        return binding.root
    }

    @SuppressLint("ResourceAsColor")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.chosenRv.adapter = adapter
        binding.avatarImg.setOnClickListener {
findNavController().navigate(R.id.profileSettingsFragment)
        }
        binding.readedVw.setOnClickListener {
            binding.chosenRv.isVisible = false
        //  binding.readedRv.isVisible = true
            binding.readedTv.setTextColor(R.color.white)
            binding.chosenTv.setTextColor(R.color.orange)
            binding.readedVw.setBackgroundColor(R.color.orange)
            binding.chosenVw.setBackgroundColor(R.color.white)

        }
        binding.chosenVw.setOnClickListener {
            binding.chosenRv.isVisible = true
            //  binding.readedRv.isVisible = false
            binding.readedTv.setTextColor(R.color.orange)
            binding.chosenTv.setTextColor(R.color.white)
            binding.readedVw.setBackgroundColor(R.color.white)
            binding.chosenVw.setBackgroundColor(R.color.orange)

        }
    }
}