package com.example.muraskitepkana.ui.library.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.muraskitepkana.databinding.ParentItemLibraryBinding
import com.example.muraskitepkana.ui.library.model.MainBookModel

class MainLibraryAdapter() : RecyclerView.Adapter<MainLibraryAdapter.MainLibraryViewHolder>() {

    private var data = arrayListOf<MainBookModel>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainLibraryViewHolder {
        return MainLibraryViewHolder(ParentItemLibraryBinding.inflate(LayoutInflater.from(parent.context),
            parent,
            false))
    }

    override fun onBindViewHolder(holder: MainLibraryViewHolder, position: Int) {
        holder.bind(data[position])
    }

    override fun getItemCount(): Int {
        return data.size
    }

    inner class MainLibraryViewHolder(private val binding: ParentItemLibraryBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(book: MainBookModel) {
            binding.apply {
            }

        }

    }

}