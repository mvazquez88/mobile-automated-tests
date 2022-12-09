package capabilities

import configuration.Brand
import io.appium.java_client.android.AndroidDriver
import io.appium.java_client.remote.AndroidMobileCapabilityType

class AndroidCapabilitiesProvider : CapabilitiesProvider() {
    private val androidLibertyMutualActivity = "com.safecoinsurance.consumer.presentation.activity.MainActivity"

    override fun getDriver() = AndroidDriver(webDriverURL, getDefault())

    override fun getDefault() = super.getDefault().apply {
        setCapability(AndroidMobileCapabilityType.APP_PACKAGE, Brand.get().androidPackage)
        setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, androidLibertyMutualActivity)
    }
}
