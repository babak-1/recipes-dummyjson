package com.babak.recipesdummyjson.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.babak.recipesdummyjson.api.models.CardModel
import com.babak.recipesdummyjson.databinding.CardItemBinding
import com.squareup.picasso.Picasso

class AdapterCards : RecyclerView.Adapter<AdapterCards.CardsViewHolder>() {
    private val allCards = arrayListOf<CardModel>()
    lateinit var onclickNavigate: (item:Int) -> Unit

    inner class CardsViewHolder(val cardItemBinding: CardItemBinding) :
        RecyclerView.ViewHolder(cardItemBinding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardsViewHolder {
        val view = CardItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CardsViewHolder(view)
    }

    override fun getItemCount(): Int {
        return allCards.size
    }

    override fun onBindViewHolder(holder: CardsViewHolder, position: Int) {
        val cards = allCards[position]
        holder.cardItemBinding.cuisineRecipe.text = cards.cuisine
        holder.cardItemBinding.nameRecipe.text = cards.name
        holder.cardItemBinding.ratingRecipe.text = cards.rating.toString()
        Picasso.get().load(cards.image).into(holder.cardItemBinding.imageRecipe);

        holder.cardItemBinding.oneCard.setOnClickListener {
            cards.id?.let { id -> onclickNavigate(id) }
        }
    }

    fun updateList(newlist: ArrayList<CardModel>) {
        allCards.clear()
        allCards.addAll(newlist)
        notifyDataSetChanged()
    }
}