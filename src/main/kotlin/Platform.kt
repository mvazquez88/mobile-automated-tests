import org.openqa.selenium.Platform as SeleniumPlatform

enum class Platform(val seleniumPlatform: SeleniumPlatform) {
    IOS(SeleniumPlatform.IOS),
    Android(SeleniumPlatform.ANDROID);

    companion object {
        fun parse(platform: SeleniumPlatform) = when (platform) {
            SeleniumPlatform.IOS -> Platform.IOS
            SeleniumPlatform.ANDROID -> Platform.Android
            else -> throw IllegalArgumentException("Platform $platform not supported")
        }

        fun get() = parse(SeleniumPlatform.fromString(System.getProperty("platform")))
    }
}