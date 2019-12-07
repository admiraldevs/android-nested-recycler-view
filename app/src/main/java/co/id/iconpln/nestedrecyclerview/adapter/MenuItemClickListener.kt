package co.id.iconpln.nestedrecyclerview.adapter

import co.id.iconpln.nestedrecyclerview.entity.MenuItem

interface MenuItemClickListener {
    fun onAdd(item: MenuItem)
    fun onDelete(item: MenuItem)
}