import org.automation.LandingScreen
import org.junit.Test
import org.openqa.selenium.By
import org.openqa.selenium.remote.DesiredCapabilities
import org.openqa.selenium.support.ui.WebDriverWait
import java.time.Duration

class AboutThisAppTests : TestBase() {
    override var caps: DesiredCapabilities? = ProjectCapabilities.androidCapabilities()

    @Test
    fun checkAppVersion() {
        with(LandingScreen(driver)) {
            tapAboutThisApp()
            assert(getVersionText().contains("8.0.1"))
        }
    }
}