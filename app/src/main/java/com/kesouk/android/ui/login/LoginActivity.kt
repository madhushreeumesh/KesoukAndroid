package com.kesouk.android.ui.login

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.kesouk.android.R
import com.kesouk.android.ui.Youtube.Recipe_Youtube_Activity
import com.kesouk.android.ui.base.BaseActivity
import com.kesouk.android.ui.register.RegisterActivity
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity(),View.OnClickListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        btn_log.setOnClickListener(this)
        btn_reg.setOnClickListener(this)
        btn_fb.setOnClickListener(this)
}
    override fun onClick(view: View?) {

        when (view!!.id) {
            R.id.btn_log -> {
                var intentLogin = Intent(applicationContext, BaseActivity::class.java)
                startActivity(intentLogin)
            }
            R.id.btn_reg -> {
                var intentReg = Intent(applicationContext, RegisterActivity::class.java)
                startActivity(intentReg)
            }
            R.id.btn_fb -> {
                var intent = Intent(applicationContext, Recipe_Youtube_Activity::class.java)
                startActivity(intent)
            }
        }
    }

}
