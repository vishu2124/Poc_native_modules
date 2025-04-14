// android/app/src/main/java/com/tvtest/CustomScreenModule.kt
package com.tvtest

import android.content.Intent
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import com.facebook.react.module.annotations.ReactModule

@ReactModule(name = CustomScreenModule.NAME)
class CustomScreenModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule(reactContext) {
    companion object {
        const val NAME = "CustomScreen"
    }

    override fun getName(): String = NAME

    @ReactMethod
    fun showCustomScreen() {
        val context = reactApplicationContext
        val intent = Intent(context, CustomScreenActivity::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
        context.startActivity(intent)
    }
}