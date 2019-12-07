package co.id.iconpln.nestedrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import co.id.iconpln.nestedrecyclerview.Data.Menu
import co.id.iconpln.nestedrecyclerview.adapter.MenuAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var menuData = listOf<Any>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        menuData = Menu.menus

        val menuAdapter = MenuAdapter(menuData)

        menuItem.hasFixedSize()
        menuItem.layoutManager = LinearLayoutManager(this)
        menuItem.adapter = menuAdapter
    }
}
