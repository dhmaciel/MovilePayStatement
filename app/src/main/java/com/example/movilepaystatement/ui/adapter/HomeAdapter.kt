package com.example.movilepaystatement.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.movilepaystatement.R
import home.entities.Button
import home.entities.Widgets

class HomeAdapter : RecyclerView.Adapter<HomeHolder>() {

    private val itemsList = mutableListOf<Widgets>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeHolder =
        HomeHolder(LayoutInflater.from(parent.context).inflate(R.layout.home_items, parent, false))

    override fun onBindViewHolder(holder: HomeHolder, position: Int) {
        holder.textCardName.text = itemsList[position].content.title
        holder.textCardNumber.text = itemsList[position].content.cardNumber ?: ""
        setupButton(holder.buttonCardDetail, itemsList[position].content.button)
        holder.textBalanceLabel.text = itemsList[position].content.balance?.label ?: ""
        holder.textBalanceValue.text = itemsList[position].content.balance?.value ?: ""
        setupButton(holder.buttonCardStatement, itemsList[position].content.button)
        holder.buttonCardStatement
    }

    private fun setupButton(view: android.widget.Button, button: Button?) {
        view.visibility = button?.let {
            view.text = it.text
            //TODO: creates click listener callback to view.
            View.VISIBLE
        } ?: View.GONE
    }

    override fun getItemCount() = itemsList.size

    fun setWidgetsItems(items: List<Widgets>) {
        itemsList.clear()
        itemsList.addAll(items)
        notifyDataSetChanged()
    }
}