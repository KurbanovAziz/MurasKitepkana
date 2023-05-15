package com.example.muraskitepkana.ui.onboarding.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.muraskitepkana.R
import com.example.muraskitepkana.databinding.ItemBoardBinding
import com.example.muraskitepkana.model.OnBoard

class OnBoardingAdapter(
    context: Context,
) : RecyclerView.Adapter<OnBoardingAdapter.OnBoardingViewHolder>() {


    private val data = arrayListOf(
        OnBoard(R.drawable.ic_onboard_one, context.getString(R.string.welcome_to_muras)),
        OnBoard(R.drawable.ic_onboard_two, context.getString(R.string.muras_enjoy_books)),
        OnBoard(R.drawable.ic_onboard_three, context.getString(R.string.muras_read_share))
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OnBoardingViewHolder {
        return OnBoardingViewHolder(
            ItemBoardBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: OnBoardingViewHolder, position: Int) {
        holder.bind(data[position])
    }

    override fun getItemCount(): Int {
        return data.size
    }

    inner class OnBoardingViewHolder(private val binding: ItemBoardBinding) :
        ViewHolder(binding.root) {
        fun bind(onBoard: OnBoard) {
            binding.tvTitle.text = onBoard.title
            binding.ivBoarding.setImageResource(onBoard.image!!)

            binding.btnLayout.isVisible = adapterPosition == data.lastIndex
        }
    }
}