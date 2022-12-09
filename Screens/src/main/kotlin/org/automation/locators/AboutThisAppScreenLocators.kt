package org.automation.locators

import org.automation.Platform
import org.openqa.selenium.By

interface AboutThisAppScreenLocators {
    val appVersionLabel: By

    val menuItemList: By

    val menuItemContainer: By
    val menuItemIcon: By
    val menuItemTitle: By

    companion object {
        fun byPlatform() = when (Platform.get()) {
            Platform.IOS -> AboutThisAppLocatorsiOS()
            Platform.Android -> AboutThisAppLocatorsAndroid()
        }
    }
}

class AboutThisAppLocatorsAndroid : AboutThisAppScreenLocators {
    override val appVersionLabel: By = By.id("appVersionTextView")

    override val menuItemList: By = By.id("menuRecyclerView")

    override val menuItemContainer: By = By.id("listItemButtonContainer")
    override val menuItemIcon: By = By.id("iconImageView")
    override val menuItemTitle: By = By.id("titleTextView")
}

class AboutThisAppLocatorsiOS : AboutThisAppScreenLocators {
    override val appVersionLabel: By = By.name("appVersion")

    override val menuItemList: By get() = TODO("Not yet implemented")

    override val menuItemContainer: By get() = TODO("Not yet implemented")
    override val menuItemIcon: By get() = TODO("Not yet implemented")
    override val menuItemTitle: By get() = TODO("Not yet implemented")
}