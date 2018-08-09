package com.kesouk.android.ui.register

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.kesouk.android.R
import com.kesouk.android.ui.addaddress.AddAddressActivity
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity(),View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        btn_address.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        when (view!!.id) {
            R.id.btn_address -> {
                var intentLogin = Intent(applicationContext, AddAddressActivity::class.java)
                startActivity(intentLogin)
            }
//            R.id.btn_register->{
//                var intentReg = Intent(applicationContext,RegisterActivity::class.java)
//                startActivity(intentReg)
//            }
//            R.id.tv_skip->{
//                var intentSkip = Intent(applicationContext,BaseActivity::class.java)
//                startActivity(intentSkip)
//
//            }
        }
    }
}
