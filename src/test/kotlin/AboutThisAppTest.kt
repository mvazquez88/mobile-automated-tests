import configuration.Brand
import org.automation.screens.AboutThisAppScreen
import org.automation.screens.LandingScreen
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class AboutThisAppTest : TestBase() {
    @Test
    fun checkAppVersion() {
        val landingScreen = LandingScreen(driver)

        val versionText = landingScreen
            .tapAboutThisApp()
            .getVersionText()

        assert(versionText.contains(Brand.get().expectedVersion.toRegex()))
    }

    @Test
    fun checkAvailableOptions() {
        val landingScreen = LandingScreen(driver)

        val optionItems = landingScreen
            .tapAboutThisApp()
            .getOptionItems()

        val expectedMenu = listOf(
            AboutThisAppScreen.OptionItem(index = 0, titleText = "Privacy policy", hasIcon = true),
            AboutThisAppScreen.OptionItem(index = 1, titleText = "Your California Privacy Choices", hasIcon = true),
            AboutThisAppScreen.OptionItem(index = 2, titleText = "License agreement", hasIcon = true),
            AboutThisAppScreen.OptionItem(index = 3, titleText = "Terms and conditions", hasIcon = true)
        )

        assertEquals(expectedMenu, optionItems)
    }
}