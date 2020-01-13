package co.id.iconpln.nestedrecyclerview.adapter

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import co.id.iconpln.nestedrecyclerview.R

class MenuHeaderHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val itemHeader = itemView.findViewById(R.id.tvHeaderItem) as TextView

    fun bindContent(text: String){
        itemHeader.text = text
    }
}