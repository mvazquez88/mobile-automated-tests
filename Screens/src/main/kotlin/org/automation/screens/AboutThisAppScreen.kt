package org.automation.screens

import io.appium.java_client.AppiumDriver
import org.openqa.selenium.By
import org.openqa.selenium.support.ui.WebDriverWait
import java.time.Duration

class AboutThisAppScreen(private val driver: AppiumDriver) {

    private val locators = AboutThisAppLocatorsAndroid()
    private val wait = WebDriverWait(driver, Duration.ofSeconds(10))

    fun getVersionText(): String {
        wait.until { driver.findElement(locators.appVersionLabel).isDisplayed }
        return driver.findElement(locators.appVersionLabel)?.text.orEmpty()
    }
}

interface AboutThisAppScreenLocators {
    val appVersionLabel: By
}

class AboutThisAppLocatorsAndroid : AboutThisAppScreenLocators {
    override val appVersionLabel: By = By.id("appVersionTextView")
}
class AboutThisAppLocatorsiOS : AboutThisAppScreenLocators {
    override val appVersionLabel: By = By.name("appVersion")
}