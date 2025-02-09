// swift-tools-version: 5.9
import PackageDescription

let package = Package(
    name: "SkivyPhoneHint",
    platforms: [.iOS(.v14)],
    products: [
        .library(
            name: "SkivyPhoneHint",
            targets: ["PhoneHintPlugin"])
    ],
    dependencies: [
        .package(url: "https://github.com/ionic-team/capacitor-swift-pm.git", from: "7.0.0")
    ],
    targets: [
        .target(
            name: "PhoneHintPlugin",
            dependencies: [
                .product(name: "Capacitor", package: "capacitor-swift-pm"),
                .product(name: "Cordova", package: "capacitor-swift-pm")
            ],
            path: "ios/Sources/PhoneHintPlugin"),
        .testTarget(
            name: "PhoneHintPluginTests",
            dependencies: ["PhoneHintPlugin"],
            path: "ios/Tests/PhoneHintPluginTests")
    ]
)