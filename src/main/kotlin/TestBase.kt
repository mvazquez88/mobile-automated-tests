import io.appium.java_client.AppiumDriver
import io.appium.java_client.android.AndroidDriver
import io.appium.java_client.ios.IOSDriver
import org.junit.After
import org.junit.Before
import org.openqa.selenium.remote.DesiredCapabilities
import java.net.URL

open class TestBase {
    protected lateinit var driver: AppiumDriver
    protected open var caps: DesiredCapabilities? = null
    private val webDriverURL: URL = URL("http://localhost:4723/wd/hub")

     @Before
    fun setUp() {
        driver = AndroidDriver(webDriverURL, caps)
    }

    @After
    fun tearDown() {
        driver.quit()
    }
}