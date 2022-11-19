import io.appium.java_client.AppiumDriver
import io.appium.java_client.android.AndroidDriver
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.openqa.selenium.remote.DesiredCapabilities
import java.net.URL

open class TestBase {
    protected lateinit var driver: AppiumDriver
    protected open var caps: DesiredCapabilities? = null
    private val webDriverURL: URL = URL("http://localhost:4723/wd/hub")

    @BeforeEach
    fun setUp() {
        driver = AndroidDriver(webDriverURL, caps)
    }

    @AfterEach
    fun tearDown() {
        driver.quit()
    }
}