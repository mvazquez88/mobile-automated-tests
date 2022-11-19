package org.automation.locators

import org.openqa.selenium.By

interface LandingScreenLocators {
    val aboutThisAppButton: By
}

class LandingScreenLocatorsAndroid : LandingScreenLocators {
    override val aboutThisAppButton: By = By.id("about_this_app_button")
}

class LandingScreenLocatorsiOS : LandingScreenLocators {
    override val aboutThisAppButton: By = By.name("About this app")
}