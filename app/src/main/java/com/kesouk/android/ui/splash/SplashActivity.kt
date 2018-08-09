package com.kesouk.android.ui.splash

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.kesouk.android.R
import com.kesouk.android.ui.base.BaseActivity
import com.kesouk.android.ui.login.LoginActivity
<<<<<<< HEAD
import com.kesouk.android.ui.register.RegisterActivity
=======
import com.kesouk.android.ui.login_register.LoginRegisterActivity
>>>>>>> master

class SplashActivity : AppCompatActivity() {
    private var mDelayHandler: Handler? = null
    private val SPLASH_DELAY: Long = 3000 //3 seconds

    internal val mRunnable: Runnable = Runnable {
        if (!isFinishing) {

<<<<<<< HEAD
            val intent = Intent(applicationContext, RegisterActivity::class.java)
=======
            val intent = Intent(applicationContext, LoginRegisterActivity::class.java)
>>>>>>> master
            startActivity(intent)
            finish()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        //Initialize the Handler
        mDelayHandler = Handler()

        //Navigate with delay
        //  mDelayHandler!!.postDelayed(mRunnable, SPLASH_DELAY)
        mDelayHandler!!.postDelayed({
            if (1 == 1) {
<<<<<<< HEAD
                val intent = Intent(applicationContext, RegisterActivity::class.java)
=======
                val intent = Intent(applicationContext, LoginRegisterActivity::class.java)
>>>>>>> master
                startActivity(intent)
                finish()
            } else {
                val intent = Intent(applicationContext, BaseActivity::class.java)
                startActivity(intent)
                finish()
            }


        }, SPLASH_DELAY)

    }

    public override fun onDestroy() {

        if (mDelayHandler != null) {
            mDelayHandler!!.removeCallbacks(mRunnable)
        }

        super.onDestroy()
    }

}

