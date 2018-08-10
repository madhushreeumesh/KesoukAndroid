package com.kesouk.android.ui.addaddress
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.PopupMenu
import com.kesouk.android.R
import com.kesouk.android.ui.otp.OTPActivity
import com.kesouk.android.ui.register.RegisterActivity
import kotlinx.android.synthetic.main.activity_add_address.*
import kotlinx.android.synthetic.main.toolbar.*

class AddAddressActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_address)


        iv_city_spinner.setOnClickListener {
            var pum = PopupMenu(this@AddAddressActivity, findViewById(R.id.iv_city_spinner))
            pum.inflate(R.menu.spinneritem)
            pum.show()
        }

            iv_area.setOnClickListener {
                var pum = PopupMenu(this@AddAddressActivity, findViewById(R.id.iv_area))
                pum.inflate(R.menu.spinneritem)
                pum.show()
            }
        iv_backbtn.setOnClickListener{
            var intent = Intent(applicationContext, RegisterActivity::class.java)
            startActivity(intent)
        }

        btn_save.setOnClickListener{
            var intent = Intent(applicationContext, OTPActivity::class.java)
            startActivity(intent)
        }
    }
}
