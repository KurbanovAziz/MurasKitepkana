package com.example.muraskitepkana.ui.library.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.muraskitepkana.databinding.ItemLibraryBinding
import com.example.muraskitepkana.ui.library.model.Book

class LibraryAdapter : RecyclerView.Adapter<LibraryAdapter.LibraryViewHolder>() {

    private var data = arrayListOf<Book>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LibraryViewHolder {
        return LibraryViewHolder(ItemLibraryBinding.inflate(LayoutInflater.from(parent.context),
            parent,
            false))
    }

    override fun onBindViewHolder(holder: LibraryViewHolder, position: Int) {
        holder.bind(data[position])
    }

    override fun getItemCount(): Int {
        return data.size
    }

    inner class LibraryViewHolder(private val binding: ItemLibraryBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(book: Book) {
            binding.apply {

            }

        }

    }

}