package co.id.iconpln.nestedrecyclerview.Data

import co.id.iconpln.nestedrecyclerview.R
import co.id.iconpln.nestedrecyclerview.entity.MenuItem

class Menu {
    companion object{
        val menus: List<Any>
            get() = mutableListOf(
                "Makanan",
                MenuItem("Nasi Goreng Spesial",30000,0, R.drawable.breakfast),
                MenuItem("Nasi Goreng Ayam",18000,0, R.drawable.breakfast),
                MenuItem("Nasi Goreng Kambing",22000,0, R.drawable.breakfast),
                MenuItem("Nasi Goreng Sapi",22000,0, R.drawable.breakfast),
                MenuItem("Nasi Goreng Pete",20000,0, R.drawable.breakfast),
                MenuItem("Nasi Goreng Teri",17000,0, R.drawable.breakfast),
                MenuItem("Nasi Goreng Bakso",15000,0, R.drawable.breakfast),
                "Minuman",
                MenuItem("Teh",5000, 0, R.drawable.breakfast),
                MenuItem("Jeruk",5000, 0, R.drawable.breakfast),
                MenuItem("Milo",5000, 0, R.drawable.breakfast),
                MenuItem("Good day",5000, 0, R.drawable.breakfast),
                MenuItem("Nutrisari",5000, 0, R.drawable.breakfast)
            )
    }
}