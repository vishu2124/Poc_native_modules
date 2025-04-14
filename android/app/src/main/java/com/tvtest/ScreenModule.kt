package com.tvtest

import com.facebook.react.bridge.Promise
import com.facebook.react.turbomodule.core.interfaces.TurboModule

interface ScreenModule : TurboModule {
    fun navigateToScreen(screenName: String, promise: Promise)
} 