import io.appium.java_client.remote.AndroidMobileCapabilityType.APP_ACTIVITY
import io.appium.java_client.remote.AndroidMobileCapabilityType.APP_PACKAGE
import io.appium.java_client.remote.AutomationName
import io.appium.java_client.remote.IOSMobileCapabilityType.BUNDLE_ID
import io.appium.java_client.remote.MobileCapabilityType.*
import org.openqa.selenium.Platform
import org.openqa.selenium.remote.DesiredCapabilities

object ProjectCapabilities {

    private const val androidLibertyMutualPackage = "com.lmig.pm.internet.mobile.android.libertymutual"
    private const val androidLibertyMutualActivity = "com.safecoinsurance.consumer.presentation.activity.MainActivity"

    private const val iOSLibertyMutualBundleId = "com.lmig.pm.internet.mobile.ServiceApp"

    private const val myIphoneName = "iPhone MV"
    private const val myIphoneUdid = "00008020-001C75912E78002E"
    fun androidCapabilities() = DesiredCapabilities().apply {
        setCapability(PLATFORM_NAME, Platform.ANDROID)
        setCapability(AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2)

        setCapability(APP_PACKAGE, androidLibertyMutualPackage)
        setCapability(APP_ACTIVITY, androidLibertyMutualActivity)
    }

    fun iOSCapabilities() = DesiredCapabilities().apply {
        setCapability(PLATFORM_NAME, Platform.IOS)
        setCapability(AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST)

        setCapability(BUNDLE_ID, iOSLibertyMutualBundleId)

        setCapability(DEVICE_NAME, myIphoneName)
        setCapability(UDID, myIphoneUdid)
    }
}
