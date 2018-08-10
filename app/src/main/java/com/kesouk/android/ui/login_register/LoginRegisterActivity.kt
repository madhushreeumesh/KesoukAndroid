package com.kesouk.android.ui.login_register

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.kesouk.android.R
import com.kesouk.android.ui.base.BaseActivity
import com.kesouk.android.ui.login.LoginActivity
import com.kesouk.android.ui.register.RegisterActivity
import kotlinx.android.synthetic.main.activity_login_register.*

class LoginRegisterActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_register)
        btn_login.setOnClickListener(this)
        btn_register1.setOnClickListener(this)
        tv_skip.setOnClickListener(this)

    }

    override fun onClick(view: View?) {
        when (view!!.id) {
            R.id.btn_login -> {
                var intentLogin = Intent(applicationContext, LoginActivity::class.java)
                startActivity(intentLogin)
            }
            R.id.btn_register1 -> {
                var intentReg = Intent(applicationContext, RegisterActivity::class.java)
                startActivity(intentReg)
            }
            R.id.tv_skip -> {
                var intentSkip = Intent(applicationContext, BaseActivity::class.java)
                startActivity(intentSkip)

            }
        }
    }

}
