package co.id.iconpln.nestedrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import co.id.iconpln.nestedrecyclerview.Data.Menu
import co.id.iconpln.nestedrecyclerview.adapter.MenuAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var menuData = listOf<Any>()
    private var totalOrder = 0
    private var totalPrice = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        menuData = Menu.menus.toMutableList()

        val menuAdapter = MenuAdapter(menuData)
        menuAdapter.setAddedItemListener { menuItem, position ->
            val itemCount = menuItem.count
            val menu = menuItem.copy()
            menu.count = itemCount + 1

            (menuData as MutableList<Any>)[position] = menu
            menuAdapter.notifyItemChanged(position, menu)

            totalPrice += menu.price
            totalOrder++

            tvReviewBooking.text = String.format(getString(R.string.review_booking))
        }

        menuAdapter.setRemoveItemListener { menuItem, position ->
            val itemCount = menuItem.count
            val menu = menuItem.copy()
            menu.count = itemCount - 1

            (menuData as MutableList<Any>)[position] = menu
            menuAdapter.notifyItemChanged(position, menu)

            totalPrice -= menu.price
            totalOrder--

            if (totalOrder > 0) {
                tvReviewBooking.text = String.format(getString(R.string.review_booking), totalOrder, totalPrice)
            } else {
                tvReviewBooking.text = "-"
            }
        }

        menuItem.apply {
            hasFixedSize()
            layoutManager = LinearLayoutManager(this.context)
            adapter = menuAdapter
        }

        // menuItem.hasFixedSize()
        // menuItem.layoutManager = LinearLayoutManager(this)
        // menuItem.adapter = menuAdapter
    }
}
