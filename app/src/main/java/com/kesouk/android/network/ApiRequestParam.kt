package com.android.fanooos.screens.network

import com.google.gson.JsonArray
import com.google.gson.JsonObject
import com.kesouk.android.common.Constants

object ApiRequestParam {


    lateinit var respParamObj: JsonObject
    lateinit var respParamArrey: JsonArray


    fun login(mobile: String, password: String): JsonObject {
        respParamObj = JsonObject()
        respParamObj.addProperty(Constants.PHONENUMBER, mobile)
        respParamObj.addProperty(Constants.PASSWORD, password)
        return respParamObj
    }


}