package com.example.muraskitepkana.ui.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.muraskitepkana.R
import com.example.muraskitepkana.databinding.FragmentOnBoardBinding
import com.example.muraskitepkana.ui.onboarding.adapter.OnBoardingAdapter


class OnBoardFragment : Fragment() {

    private val binding by viewBinding(FragmentOnBoardBinding::bind)
    private lateinit var adapter: OnBoardingAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_on_board, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        adapter = OnBoardingAdapter(requireContext())
        binding.viewPager.adapter = adapter
        binding.indicator.setViewPager(binding.viewPager)
        val anim = AnimationUtils.loadAnimation(requireContext(), R.anim.bounce_up)
        binding.logoLayout.startAnimation(anim)
    }
}