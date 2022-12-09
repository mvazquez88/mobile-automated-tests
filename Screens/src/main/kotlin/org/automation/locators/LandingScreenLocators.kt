package org.automation.locators

import org.automation.Platform
import org.openqa.selenium.By

interface LandingScreenLocators {
    val aboutThisAppButton: By

    companion object {
        fun byPlatform() = when (Platform.get()) {
            Platform.IOS -> LandingScreenLocatorsiOS()
            Platform.Android -> LandingScreenLocatorsAndroid()
        }
    }
}

class LandingScreenLocatorsAndroid : LandingScreenLocators {
    override val aboutThisAppButton: By = By.id("aboutThisAppButton")
}

class LandingScreenLocatorsiOS : LandingScreenLocators {
    override val aboutThisAppButton: By = By.name("About this app")
}