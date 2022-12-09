package org.automation.screens

import io.appium.java_client.AppiumDriver
import org.automation.locators.AboutThisAppScreenLocators

class AboutThisAppScreen(driver: AppiumDriver) : Screen(driver) {

    private val locators: AboutThisAppScreenLocators = AboutThisAppScreenLocators.byPlatform()

    fun getVersionText(): String {
        defaultWait.until { driver.findElement(locators.appVersionLabel).isDisplayed }
        return driver.findElement(locators.appVersionLabel)?.text.orEmpty()
    }

    fun getOptionItems(): List<OptionItem> {
        defaultWait.until { driver.findElement(locators.menuItemList).isDisplayed }

        return driver.findElements(locators.menuItemContainer)
            .mapIndexed { index, webElement ->
                OptionItem(
                    index,
                    titleText = webElement.findElement(locators.menuItemTitle).text,
                    hasIcon = webElement.findElement(locators.menuItemIcon).isDisplayed
                )
            }
    }

    data class OptionItem(
        val index: Int,
        val titleText: String,
        val hasIcon: Boolean
    )
}