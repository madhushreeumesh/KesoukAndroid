package com.kesouk.android.ui.otp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.Toolbar
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.kesouk.android.R

class OTPActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_otp)

        val mToolbar = findViewById(R.id.app_bar) as Toolbar
        (mToolbar.findViewById(R.id.iv_backbtn) as ImageView).visibility = View.GONE

        var mToolbarTitle = findViewById(R.id.toolbar_title) as TextView
        mToolbarTitle.setText("OTP")
        mToolbarTitle.setVisibility(View.VISIBLE)
    }
}
