import capabilities.CapabilitiesProvider
import io.appium.java_client.AppiumDriver
import io.appium.java_client.android.AndroidDriver
import io.appium.java_client.ios.IOSDriver
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach

import java.net.URL

open class TestBase {
    protected lateinit var driver: AppiumDriver

    @BeforeEach
    fun setUp() {
        driver = CapabilitiesProvider.byPlatform().getDriver()
    }

    @AfterEach
    fun tearDown() {
        driver.quit()
    }
}

