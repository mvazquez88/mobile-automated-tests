package org.automation.screens

import io.appium.java_client.AppiumDriver
import org.automation.locators.LandingScreenLocators
import org.automation.locators.LandingScreenLocatorsAndroid

class LandingScreen(driver: AppiumDriver) : Screen(driver) {

    private val locators: LandingScreenLocators = LandingScreenLocatorsAndroid()

    fun tapAboutThisApp(): AboutThisAppScreen {
        defaultWait.until { driver.findElement(locators.aboutThisAppButton).isDisplayed }
        driver.findElement(locators.aboutThisAppButton)?.click()
        return AboutThisAppScreen(driver)
    }
}