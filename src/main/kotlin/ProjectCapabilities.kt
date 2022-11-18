import org.openqa.selenium.remote.DesiredCapabilities

class ProjectCapabilities {
    companion object {
        fun AndroidBaseCapabilities(): DesiredCapabilities {
            val caps = DesiredCapabilities()
            caps.setCapability("platformName", "Android")
            caps.setCapability("automationName", "UiAutomator2")
            caps.setCapability("appPackage", "com.lmig.pm.internet.mobile.android.libertymutual")
            caps.setCapability("appActivity", "com.safecoinsurance.consumer.presentation.activity.MainActivity")
            return caps
        }
    }
}