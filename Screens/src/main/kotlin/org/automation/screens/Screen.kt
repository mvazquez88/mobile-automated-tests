package org.automation.screens

import io.appium.java_client.AppiumDriver
import org.openqa.selenium.By
import org.openqa.selenium.support.ui.WebDriverWait
import java.time.Duration

open class Screen(protected val driver: AppiumDriver) {

    protected val defaultWait = WebDriverWait(driver, Duration.ofSeconds(5), Duration.ofMillis(100))

    protected fun By.waitUntilDisplayed() {
        defaultWait.until { driver.findElement(this).isDisplayed }
    }

    protected fun By.click() {
        driver.findElement(this)?.click()
    }
}