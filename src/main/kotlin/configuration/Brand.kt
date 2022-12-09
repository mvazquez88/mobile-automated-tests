package configuration

enum class Brand(val rawValue: String, val androidPackage: String, val expectedVersion: String) {
    LibertyMutual(
        rawValue = "LM",
        androidPackage = "com.lmig.pm.internet.mobile.android.libertymutual.debug",
        expectedVersion = "8.[0-9].[0-9]"
    ),
    Safeco(
        rawValue = "SF",
        androidPackage = "com.safecoinsurance.consumer.debug",
        expectedVersion = "3.[8-9].[0-9]"
    );

    companion object {
        fun get(): Brand {
            val brand = System.getProperty("brand")

            return values()
                .firstOrNull { it.rawValue == brand }
                ?: throw IllegalArgumentException("configuration.Brand $brand not supported")
        }
    }
}