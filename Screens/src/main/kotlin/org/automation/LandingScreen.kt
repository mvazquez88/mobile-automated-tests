package org.automation

import io.appium.java_client.AppiumDriver
import org.openqa.selenium.By
import org.openqa.selenium.support.ui.WebDriverWait
import java.time.Duration

class LandingScreen(private val driver: AppiumDriver) {

    private val aboutThisAppButton: String = "about_this_app_button"
    private val appVersionTextView: String = "appVersionTextView"

    private val iosAboutThisAppButtonName: String = "About this app"
    private val appVersionTextViewName: String = "appVersion"

    private val wait = WebDriverWait(driver, Duration.ofSeconds(10))

    fun tapAboutThisApp() {
        wait.until { driver.findElement(By.id(aboutThisAppButton)).isDisplayed }
        driver.findElement(By.id(aboutThisAppButton))?.click()
    }

    fun getVersionText(): String {
        wait.until { driver.findElement(By.id(appVersionTextView)).isDisplayed }
        return driver.findElement(By.id(appVersionTextView))?.text ?: ""
    }
}