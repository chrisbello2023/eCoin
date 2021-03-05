rootProject.name = "cosmos"

include(
    "cosmos-core",
    "cosmos-api-client",
    "cosmos-websocket",
    "cosmos-bundled"
)

include(
    "brd-android:app",
    "brd-android:app-core",
    "brd-android:ui:ui-common",
    "brd-android:ui:ui-navigation",
    "brd-android:ui:ui-staking",
    "brd-android:ui:ui-gift",
    "brd-android:theme"
)

enableFeaturePreview("GRADLE_METADATA")