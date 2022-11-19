package org.automation.screens

import io.appium.java_client.AppiumDriver
import org.openqa.selenium.By
import org.openqa.selenium.support.ui.WebDriverWait
import java.time.Duration

class LandingScreen(private val driver: AppiumDriver) {

    private val locators = LandingScreenLocatorsAndroid()

    private val wait = WebDriverWait(driver, Duration.ofSeconds(10))

    fun tapAboutThisApp(): AboutThisAppScreen {
        wait.until { driver.findElement(locators.aboutThisAppButton).isDisplayed }
        driver.findElement(locators.aboutThisAppButton)?.click()
        return AboutThisAppScreen(driver)
    }
}

interface LandingScreenLocators {
    val aboutThisAppButton: By
}

class LandingScreenLocatorsAndroid : LandingScreenLocators {
    override val aboutThisAppButton: By = By.id("about_this_app_button")
}
class LandingScreenLocatorsiOS : LandingScreenLocators {
    override val aboutThisAppButton: By = By.name("About this app")
}