package com.kesouk.android.util

import android.app.Activity
import android.app.Application
import android.os.Bundle
import android.support.multidex.BuildConfig
import android.support.multidex.MultiDexApplication
import com.facebook.stetho.Stetho
import com.facebook.stetho.okhttp3.StethoInterceptor
import com.android.fanooos.screens.apipresenter.RestApi
import com.android.fanooos.screens.network.ApiConstants
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit


class AppController : MultiDexApplication(), Application.ActivityLifecycleCallbacks {
    companion object {
        val TAG: String = "AppController"
        lateinit var mInstance: AppController
        lateinit var service: RestApi

    }

    override fun onCreate() {
        super.onCreate()
        mInstance = this
        createRetrofitObj()
        registerActivityLifecycleCallbacks(this)
    }


    fun createRetrofitObj() {
        val retrofit = Retrofit.Builder()
                .baseUrl(ApiConstants.BASE_URL)
                .client(getRequestHeader())
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        service = retrofit.create(RestApi::class.java)
    }

    fun getRequestHeader(): OkHttpClient {
        val okHttpClient: OkHttpClient.Builder = OkHttpClient.Builder()
        okHttpClient.readTimeout(10, TimeUnit.SECONDS)
        okHttpClient.writeTimeout(10, TimeUnit.SECONDS)
        if (BuildConfig.DEBUG) {
            Stetho.initializeWithDefaults(this)
            val logging: HttpLoggingInterceptor = HttpLoggingInterceptor()
            logging.setLevel(HttpLoggingInterceptor.Level.BODY)
            okHttpClient.addNetworkInterceptor(StethoInterceptor())
            okHttpClient.addInterceptor(logging)
        }
        return okHttpClient.build()
    }

    override fun onActivityCreated(activity: Activity?, savedInstanceState: Bundle?) {

    }

    override fun onActivityPaused(activity: Activity?) {

    }

    override fun onActivityResumed(activity: Activity?) {

    }

    override fun onActivityStarted(activity: Activity?) {

    }

    override fun onActivityDestroyed(activity: Activity?) {

    }

    override fun onActivitySaveInstanceState(activity: Activity?, outState: Bundle?) {

    }

    override fun onActivityStopped(activity: Activity?) {

    }


}