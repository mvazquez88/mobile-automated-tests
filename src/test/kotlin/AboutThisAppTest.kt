import org.automation.screens.LandingScreen
import org.junit.jupiter.api.Test

class AboutThisAppTest : TestBase() {
    @Test
    fun checkAppVersion() {
        val landingScreen = LandingScreen(driver)

        val versionText = landingScreen
            .tapAboutThisApp()
            .getVersionText()

        assert(versionText.contains("8.0.1"))
    }
}