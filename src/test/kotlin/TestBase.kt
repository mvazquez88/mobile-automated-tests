import io.appium.java_client.AppiumDriver
import io.appium.java_client.android.AndroidDriver
import io.appium.java_client.ios.IOSDriver
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.openqa.selenium.Platform
import org.openqa.selenium.remote.DesiredCapabilities
import java.net.URL

open class TestBase {
    protected lateinit var driver: AppiumDriver
    protected open var caps: DesiredCapabilities? = null
    private val webDriverURL: URL = URL("http://localhost:4723/wd/hub")

    @BeforeEach
    fun setUp() {
        driver = getPlatformDriver()
    }

    @AfterEach
    fun tearDown() {
        driver.quit()
    }

    private fun getPlatform(): Platform {
        val platformArg = System.getProperty("platform")
        return Platform.fromString(platformArg)
    }

    private fun getPlatformDriver(): AppiumDriver {
        return when (val platform = getPlatform()) {
            Platform.ANDROID -> AndroidDriver(webDriverURL, caps)
            Platform.IOS -> IOSDriver(webDriverURL, caps)
            else -> throw IllegalArgumentException("Platform $platform not supported")
        }
    }
}

