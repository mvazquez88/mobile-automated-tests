package org.automation.screens

import io.appium.java_client.AppiumDriver
import org.automation.locators.AboutThisAppLocatorsAndroid
import org.automation.locators.AboutThisAppScreenLocators

class AboutThisAppScreen(driver: AppiumDriver): Screen(driver) {

    private val locators: AboutThisAppScreenLocators = AboutThisAppLocatorsAndroid()

    fun getVersionText(): String {
        defaultWait.until { driver.findElement(locators.appVersionLabel).isDisplayed }
        return driver.findElement(locators.appVersionLabel)?.text.orEmpty()
    }
}