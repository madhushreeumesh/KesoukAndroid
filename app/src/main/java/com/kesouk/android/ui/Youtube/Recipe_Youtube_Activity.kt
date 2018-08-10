package com.kesouk.android.ui.Youtube

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.Toolbar
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.kesouk.android.R

class Recipe_Youtube_Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recipe__youtube_)

        var mToolbarTitle = findViewById(R.id.toolbar_title) as TextView
        mToolbarTitle.setText("")
        mToolbarTitle.setVisibility(View.VISIBLE)
    }
}
