package com.kesouk.android.ui.base.fragments.category

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import com.kesouk.android.R
import java.util.ArrayList


fun newInstance(): Category_Tab_Fragment {
    return Category_Tab_Fragment()
}

class Category_Tab_Fragment : Fragment(){

    lateinit var recyclerView: RecyclerView
    lateinit var productList: ArrayList<Category>

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view = inflater.inflate(R.layout.category_tab_fragment, container, false)
        activity!!.window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN)

//        var mToolbar = view.findViewById(R.id.logintoolbar) as Toolbar
//        (mToolbar.findViewById(R.id.search_new) as EditText).visibility = View.GONE
//        var mToolbarTitle = view.findViewById(R.id.fragment_toolbar_title) as TextView
//        mToolbarTitle.setText("CATEGORY")
//        mToolbarTitle.setVisibility(View.VISIBLE)


        recyclerView = view.findViewById<View>(R.id.recycler_view) as RecyclerView
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(context)
        productList = ArrayList()
        productList.add(
                Category(
                        R.drawable.logo,
                        "Fruits",
                        R.drawable.expand))
        productList.add(
                Category(
                        R.drawable.logo,
                        "Vegetables",
                        R.drawable.expand))
        productList.add(
                Category(
                        R.drawable.logo,
                        "Chilled",
                        R.drawable.expand))
        productList.add(
                Category(
                        R.drawable.logo,
                        "MilkProducts",
                        R.drawable.expand))
        productList.add(
                Category(
                        R.drawable.logo,
                        "Canned Foods",
                        R.drawable.expand))

        val adapter = CategoryAdapter(context!!, productList)

        recyclerView.adapter = adapter
        return view

        return view
    }

}