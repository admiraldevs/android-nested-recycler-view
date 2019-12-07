package co.id.iconpln.nestedrecyclerview.adapter

import android.view.View
import android.widget.TextView
import co.id.iconpln.nestedrecyclerview.entity.MenuItem
import androidx.recyclerview.widget.RecyclerView
import co.id.iconpln.nestedrecyclerview.R
import kotlinx.android.synthetic.main.item_menu.view.*

class MenuItemHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    private val itemName = itemView.findViewById(R.id.itemName) as TextView
    private val itemPrice = itemView.findViewById(R.id.itemPrice) as TextView
    private val itemCount = itemView.findViewById(R.id.itemCount) as TextView

    fun bindContent(menuItem: MenuItem){
        itemName.text = menuItem.name
        itemPrice.text = "Rp. ${menuItem.price}"
        itemCount.text = menuItem.count.toString()
    }
}