package com.example.muraskitepkana.ui.profile.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Adapter
import androidx.recyclerview.widget.RecyclerView
import com.example.muraskitepkana.R
import com.example.muraskitepkana.databinding.BookItemBinding
import com.example.muraskitepkana.ui.profile.model.Book
import com.geektech.tasks.ext.loadImage

class BookAdapter(): RecyclerView.Adapter<BookAdapter.BookViewHolder>() {
    private var data = arrayListOf<Book>()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookViewHolder {
        return BookViewHolder(
            BookItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: BookViewHolder, position: Int) {
        holder.bind(data[position])
    }

    override fun getItemCount(): Int {
        return data.size
    }

    inner class BookViewHolder(private val binding: BookItemBinding) : RecyclerView.ViewHolder(binding.root) {
        @SuppressLint("ResourceType")
        fun bind(book: Book) {
with(binding){
    bookImg.loadImage(book.image)
    authorTv.text = book.author
    nameTv.text = book.name
    scoreTv.text = book.score.toString()
    if (book.chosen){
        chosenImg.setImageResource(R.id.chosen_img)
    }else{
     //   chosenImg.setImageResource(R.id.no_chosen_img)
    }
}
        }

    }

}