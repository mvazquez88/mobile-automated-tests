package org.automation.screens

import io.appium.java_client.AppiumDriver
import org.automation.locators.LandingScreenLocators

class LandingScreen(driver: AppiumDriver) : Screen(driver) {

    private val locators: LandingScreenLocators = LandingScreenLocators.byPlatform()

    fun tapAboutThisApp(): AboutThisAppScreen {
        with(locators.aboutThisAppButton) {
            waitUntilDisplayed()
            click()
        }
        return AboutThisAppScreen(driver)
    }
}