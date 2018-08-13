package com.kesouk.android.ui.register

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.Toolbar
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.kesouk.android.R
import com.kesouk.android.ui.addaddress.AddAddressActivity
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity(),View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        btn_address.setOnClickListener(this)

      val mToolbar = findViewById(R.id.app_bar) as Toolbar
        (mToolbar.findViewById(R.id.iv_backbtn) as ImageView).visibility = View.GONE

//      var mToolbarTitle = findViewById(R.id.toolbar_title) as TextView
//        mToolbarTitle.setText("Register")
//        mToolbarTitle.setVisibility(View.VISIBLE)
    }

    override fun onClick(view: View?) {
        when (view!!.id) {
            R.id.btn_address -> {
                var intentLogin = Intent(applicationContext, AddAddressActivity::class.java)
                startActivity(intentLogin)
            }
        }
    }
}
