package capabilities

import io.appium.java_client.android.AndroidDriver
import io.appium.java_client.remote.AndroidMobileCapabilityType
import io.appium.java_client.remote.AutomationName
import io.appium.java_client.remote.MobileCapabilityType
import org.openqa.selenium.Platform

class AndroidCapabilitiesProvider : CapabilitiesProvider() {
    private val androidLibertyMutualPackage = "com.lmig.pm.internet.mobile.android.libertymutual"
    private val androidLibertyMutualActivity = "com.safecoinsurance.consumer.presentation.activity.MainActivity"

    override fun getDriver() = AndroidDriver(webDriverURL, getDefault())

    override fun getDefault() = super.getDefault().apply {
        setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID)
        setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2)

        setCapability(AndroidMobileCapabilityType.APP_PACKAGE, androidLibertyMutualPackage)
        setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, androidLibertyMutualActivity)
    }
}
