package com.example.movilepaystatement.ui.adapter

import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.movilepaystatement.R

class HomeHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val textCardName: TextView = itemView.findViewById(R.id.text_card_name)
    val textCardNumber: TextView = itemView.findViewById(R.id.text_card_number)
    val buttonCardDetail: Button = itemView.findViewById(R.id.button_card_detail)
    val textBalanceLabel: TextView = itemView.findViewById(R.id.text_balance_label)
    val textBalanceValue: TextView = itemView.findViewById(R.id.text_balance_value)
    val buttonCardStatement: Button = itemView.findViewById(R.id.button_card_statement)
}