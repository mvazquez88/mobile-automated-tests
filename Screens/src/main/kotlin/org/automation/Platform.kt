package org.automation

import io.appium.java_client.remote.AutomationName
import org.openqa.selenium.Platform as SeleniumPlatform

enum class Platform(val seleniumPlatform: SeleniumPlatform, val automation: String) {
    IOS(SeleniumPlatform.IOS, AutomationName.IOS_XCUI_TEST),
    Android(SeleniumPlatform.ANDROID, AutomationName.ANDROID_UIAUTOMATOR2);

    companion object {
        fun get(): Platform {
            val platform = SeleniumPlatform.fromString(System.getProperty("platform"))

            return values()
                .firstOrNull { it.seleniumPlatform == platform }
                ?: throw IllegalArgumentException("Platform $platform not supported")
        }
    }
}