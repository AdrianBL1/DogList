package com.adrianbl.tutorialdoglist

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.adrianbl.tutorialdoglist.databinding.ItemBinding
import com.squareup.picasso.Picasso

class DogViewHolder(view: View): RecyclerView.ViewHolder(view) {

    private val binding = ItemBinding.bind(view)

    fun bind(image: String){
        Picasso.get().load(image).into(binding.ivDog)
    }
}