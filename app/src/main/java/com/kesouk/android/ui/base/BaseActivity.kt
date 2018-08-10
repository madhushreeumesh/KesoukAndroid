package com.kesouk.android.ui.base

import android.content.Intent
import android.os.Bundle
import android.support.annotation.NonNull
import android.support.design.internal.BottomNavigationItemView
import android.support.design.internal.BottomNavigationMenuView
import android.support.design.widget.BottomNavigationView
import android.support.design.widget.NavigationView
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentTransaction
import android.support.v4.view.GravityCompat
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.View
import com.kesouk.android.R
import com.kesouk.android.ui.base.fragments.*
import com.kesouk.android.ui.login.LoginActivity
import com.kesouk.android.ui.login_register.LoginRegisterActivity
import kotlinx.android.synthetic.main.activity_base.*
import kotlinx.android.synthetic.main.app_bar_main_home.*

class BaseActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_base)

        logintoolbar.setBackgroundColor(resources.getColor(R.color.dark_green))
        setSupportActionBar(logintoolbar)

        search_new.visibility = View.VISIBLE
        toolbar_title.visibility = View.GONE


        val toggle = ActionBarDrawerToggle(
                this, drawer_layout, logintoolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)
        drawer_layout.addDrawerListener(toggle)
        toggle.syncState()

        nav_view.setNavigationItemSelectedListener(this)

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
        BottomNavigationViewHelper.removeShiftMode(navigation)
    }


    private val mOnNavigationItemSelectedListener = object:BottomNavigationView.OnNavigationItemSelectedListener {
        override fun onNavigationItemSelected(@NonNull item:MenuItem):Boolean {

            val fragment: Fragment
            when (item.getItemId()) {
                R.id.action_item1 -> {
                    fragment = Home_Fragment()
                    loadFragment(fragment)
                    return true
                }
                R.id.action_item2-> {
                    fragment = Category_Tab_Fragment()
                    loadFragment(fragment)
                    return true

                }
                R.id.action_item3-> {
                    fragment = Search_Fragment()
                    loadFragment(fragment)
                    return true

                }
                R.id.action_item4-> {
                    fragment = Favorites_Fragment()
                    loadFragment(fragment)
                    return true

                }
                R.id.action_item5-> {
                    fragment = Basket_Fragment()
                    loadFragment(fragment)
                    return true

                }
            }
            return false
        }
    }
    fun loadFragment(fragment: Fragment)
    {
        val fm = getSupportFragmentManager()
        val ft = fm.beginTransaction()
        ft.replace(R.id.rldContainer, fragment)
        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
        ft.addToBackStack("Some String")
        ft.commit()
    }

    override fun onBackPressed() {
        if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
            drawer_layout.closeDrawer(GravityCompat.START)
        } else {
            val intent = Intent(applicationContext,LoginRegisterActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.base, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        when (item.itemId) {
            R.id.action_settings -> return true
            R.id.my_acc -> {
                val intent = Intent(applicationContext, LoginActivity::class.java)
                startActivity(intent)
                return true
            }
            R.id.signin -> {
                val intents = Intent(applicationContext, LoginActivity::class.java)
                startActivity(intents)
                return true
            }
            else ->
                return super.onOptionsItemSelected(item)
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {


        drawer_layout.closeDrawer(GravityCompat.START)
        return true
    }
}

object BottomNavigationViewHelper {

    fun removeShiftMode(view:BottomNavigationView) {
        val menuView = view.getChildAt(0) as BottomNavigationMenuView
        try
        {
            val shiftingMode = menuView.javaClass.getDeclaredField("mShiftingMode")
            shiftingMode.setAccessible(true)
            shiftingMode.setBoolean(menuView, false)
            shiftingMode.setAccessible(false)

            for (i in 0 until menuView.getChildCount())
            {

                val item = menuView.getChildAt(i) as BottomNavigationItemView
                item.setShiftingMode(false)
                // set once again checked value, so view will be updated
                item.setChecked(item.getItemData().isChecked())
            }
        }
        catch (e:NoSuchFieldException) {
            Log.e("ERROR NO SUCH FIELD", "Unable to get shift mode field")
        }
        catch (e:IllegalAccessException) {
            Log.e("ERROR ILLEGAL ALG", "Unable to change value of shift mode")
        }
    }

}
