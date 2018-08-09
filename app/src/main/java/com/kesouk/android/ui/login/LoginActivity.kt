package com.kesouk.android.ui.login

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.kesouk.android.R
import com.kesouk.android.ui.base.BaseActivity
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        //btn_sign_in.setOnClickListener(this)
    }

//    override fun onClick(view: View?) {
//        if (view != null) {
//            when (view.id) {
//                R.id.btn_sign_in -> {
//                    startActivity(Intent(this, BaseActivity::class.java))
//                }
//            }
//        }
   // }
}
