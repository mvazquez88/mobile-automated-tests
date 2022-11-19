package capabilities

import io.appium.java_client.ios.IOSDriver
import io.appium.java_client.remote.AutomationName
import io.appium.java_client.remote.IOSMobileCapabilityType
import io.appium.java_client.remote.MobileCapabilityType
import org.openqa.selenium.Platform

class IOSCapabilitiesProvider : CapabilitiesProvider() {
    private val iOSLibertyMutualBundleId = "com.lmig.pm.internet.mobile.ServiceApp"

    private val myIphoneName = "iPhone MV"
    private val myIphoneUdid = "00008020-001C75912E78002E"

    override fun getDriver() = IOSDriver(webDriverURL, getDefault())

    override fun getDefault() = super.getDefault().apply {
        setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.IOS)
        setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST)

        setCapability(IOSMobileCapabilityType.BUNDLE_ID, iOSLibertyMutualBundleId)

        setCapability(MobileCapabilityType.DEVICE_NAME, myIphoneName)
        setCapability(MobileCapabilityType.UDID, myIphoneUdid)
    }
}