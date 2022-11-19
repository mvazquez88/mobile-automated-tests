import org.automation.screens.LandingScreen
import org.junit.Test
import org.openqa.selenium.remote.DesiredCapabilities

class AboutThisAppTests : TestBase() {
    override var caps: DesiredCapabilities? = ProjectCapabilities.androidCapabilities()

    @Test
    fun checkAppVersion() {
        val landingScreen = LandingScreen(driver)

        val versionText = landingScreen
            .tapAboutThisApp()
            .getVersionText()

        assert(versionText.contains("8.0.1"))
    }
}