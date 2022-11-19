package org.automation.screens

import io.appium.java_client.AppiumDriver
import org.openqa.selenium.support.ui.WebDriverWait
import java.time.Duration

open class Screen(protected val driver: AppiumDriver) {

    protected val defaultWait = WebDriverWait(driver, Duration.ofSeconds(3))
}