package capabilities

import Platform
import io.appium.java_client.AppiumDriver
import org.openqa.selenium.remote.DesiredCapabilities
import java.net.URL

abstract class CapabilitiesProvider {

    protected val webDriverURL = URL(System.getProperty("WebDriverUrl") ?: "http://localhost:4723/wd/hub")

    open fun getDefault() = DesiredCapabilities().apply {
        // Shared capabilities go here
    }

    abstract fun getDriver(): AppiumDriver

    companion object {
        fun byPlatform(): CapabilitiesProvider = when (Platform.get()) {
            Platform.IOS -> IOSCapabilitiesProvider()
            Platform.Android -> AndroidCapabilitiesProvider()
        }
    }
}

