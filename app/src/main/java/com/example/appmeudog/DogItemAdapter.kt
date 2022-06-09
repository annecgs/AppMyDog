package com.example.appmeudog

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.appmeudog.databinding.DogListItemBinding
import com.example.appmeudog.model.Dog

class DogItemAdapter: ListAdapter<Dog,DogItemAdapter.DogItemViewHolder> (DIFF_CALLBACK) {

    class DogItemViewHolder(private val binding: DogListItemBinding) : RecyclerView.ViewHolder(binding.root){

        fun bind(dog:Dog){
            binding.dogName.text = dog.name
            binding.dogBredForAndBreedGroup.text = binding.root.context.getString(R.string.dog_bred_for_and_breed_group,
            dog.bred_for,dog.breed_group)
        }
    }

    companion object {
        private val DIFF_CALLBACK = object : DiffUtil.ItemCallback<Dog>(){
            override fun areItemsTheSame(oldItem: Dog, newItem: Dog): Boolean {
                return oldItem.id == newItem.id
            }

            override fun areContentsTheSame(oldItem: Dog, newItem: Dog): Boolean {
                return oldItem == newItem
            }

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DogItemViewHolder {
        val binding = DogListItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return DogItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: DogItemViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

}