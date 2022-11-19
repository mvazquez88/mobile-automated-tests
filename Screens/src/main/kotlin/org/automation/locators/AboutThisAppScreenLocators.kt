package org.automation.locators

import org.openqa.selenium.By

interface AboutThisAppScreenLocators {
    val appVersionLabel: By
}

class AboutThisAppLocatorsAndroid : AboutThisAppScreenLocators {
    override val appVersionLabel: By = By.id("appVersionTextView")
}
class AboutThisAppLocatorsiOS : AboutThisAppScreenLocators {
    override val appVersionLabel: By = By.name("appVersion")
}