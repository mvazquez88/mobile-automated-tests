import org.junit.Test
import org.openqa.selenium.By
import org.openqa.selenium.remote.DesiredCapabilities
import org.openqa.selenium.support.ui.WebDriverWait
import java.time.Duration

class AboutThisAppTests : TestBase() {
    override var caps: DesiredCapabilities? = ProjectCapabilities.androidCapabilities()

    private val aboutThisAppButton: String = "about_this_app_button"
    private val appVersionTextView: String = "appVersionTextView"

    private val iosAboutThisAppButtonName: String = "About this app"
    private val appVersionTextViewName: String = "appVersion"

    @Test
    fun checkAppVersion() {
        val driver = driver ?: return
        val wait = WebDriverWait(driver, Duration.ofSeconds(10))

        wait.until { driver.findElement(By.id(aboutThisAppButton)).isDisplayed }
        driver.findElement(By.id(aboutThisAppButton))?.click()

        wait.until { driver.findElement(By.id(appVersionTextView)).isDisplayed }
        val appVersion = driver.findElement(By.id(appVersionTextView))?.text ?: return

        assert(appVersion.contains("8.0.1"))
    }
}