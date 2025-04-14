package com.tvtest

import com.facebook.react.bridge.Promise
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.module.annotations.ReactModule
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod

@ReactModule(name = ScreenModuleImpl.NAME)
class ScreenModuleImpl(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule(reactContext), ScreenModule {
    companion object {
        const val NAME = "ScreenModule"
    }

    override fun getName(): String = NAME

    override fun initialize() {
        super.initialize()
        // Initialize any resources if needed
    }

    @ReactMethod
    override fun navigateToScreen(screenName: String, promise: Promise) {
        try {
            // Here you can implement your native navigation logic
            // For example, starting a new Activity
            promise.resolve("Navigated to $screenName")
        } catch (e: Exception) {
            promise.reject("ERROR", e.message)
        }
    }

    override fun invalidate() {
        super.invalidate()
        // Clean up any resources if needed
    }
} 