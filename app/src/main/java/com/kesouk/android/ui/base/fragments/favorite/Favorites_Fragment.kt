package com.kesouk.android.ui.base.fragments.favorite

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.Toolbar
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import android.widget.EditText
import android.widget.TextView
import com.kesouk.android.R

class Favorites_Fragment : Fragment(){

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view = inflater.inflate(R.layout.favorite_fragment, container, false)
        activity!!.window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN)

//        var mToolbar = view.findViewById(R.id.logintoolbar) as Toolbar
//        (mToolbar.findViewById(R.id.search_new) as EditText).visibility = View.GONE
//        var mToolbarTitle = view.findViewById(R.id.fragment_toolbar_title) as TextView
//        mToolbarTitle.setText("REVIEW ORDER")
//        mToolbarTitle.setVisibility(View.VISIBLE)


        return view
    }
}