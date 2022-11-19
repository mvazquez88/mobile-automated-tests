package capabilities

import Platform
import io.appium.java_client.AppiumDriver
import io.appium.java_client.remote.MobileCapabilityType
import org.openqa.selenium.remote.DesiredCapabilities
import java.net.URL

abstract class CapabilitiesProvider {

    protected val webDriverURL = URL(System.getProperty("WebDriverUrl") ?: "http://localhost:4723/wd/hub")

    open fun getDefault() = DesiredCapabilities().apply {
        val platform = Platform.get()
        setCapability(MobileCapabilityType.PLATFORM_NAME, platform.seleniumPlatform)
        setCapability(MobileCapabilityType.AUTOMATION_NAME, platform.automation)
    }

    abstract fun getDriver(): AppiumDriver

    companion object {
        fun byPlatform(): CapabilitiesProvider = when (Platform.get()) {
            Platform.IOS -> IOSCapabilitiesProvider()
            Platform.Android -> AndroidCapabilitiesProvider()
        }
    }
}

