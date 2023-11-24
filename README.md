
### eCoin is the best way to get started with bitcoin.
Our simple, streamlined design is easy for beginners, yet powerful enough for experienced users.


### Your Decentralized Bitcoin Wallet

Unlike other mobile bitcoin wallets, **eCoin** users have the option to disable Fastsync converting the wallet into a standalone bitcoin client.
It connects directly to the bitcoin network using [SPV](https://en.bitcoin.it/wiki/Thin_Client_Security#Header-Only_Clients) mode, and doesn't rely on servers that can be hacked or disabled.
If BRD the company disappears, your private key can still be derived from the recovery phrase to recover your funds since your funds exist on the blockchain.

### Cutting-edge security

**eCoin** utilizes the latest mobile security features to protect users from malware, browser security holes, and even physical theft.
On Android The user’s private key is encrypted using the Android Keystore, inaccessible to anyone other than the user.
On iOS the user’s private key is stored in the device keychain, secured by Secure Enclave, inaccessible to anyone other than the user.
Users are also able to backup their wallet using iCloud Keychain to store an encrypted backup of their recovery phrase.
The backup is encrypted with the BRD app PIN.

### Features

- Supports wallets for Bitcoin, Bitcoin Cash, Ethereum and ERC-20 tokens, Ripple, Hedera, Tezos
- Single recovery key is all that's needed to backup your wallet
- Private keys never leave your device and are end-to-end encrypted when using iCloud backup
- Save a memo for each transaction (off-chain)


### Prerequisites

- Install [OpenJDK 8+](https://adoptopenjdk.net/installation.html?variant=openjdk8)
- Download [Intellij IDEA](https://www.jetbrains.com/idea/) or [Android Studio](https://developer.android.com/studio/)

### Setup

1. Clone this repository `git clone
2. Open the `Cosmos` folder using Intellij IDEA or Android Studio
3.  (iOS Development) Open the `brd-ios/breadwallet.xcworkspace` file in xcode

## Advanced Setup

### Blockset Client Token

(Android) The [Blockset client token](https://blockset.com/docs/v1/tools/authentication) can be set in [gradle.properties](gradle.properties) or by using `-PBDB_CLIENT_TOKEN="<client token>"`.
A default token is available for testing.

(iOS) Add your Blockset client token to your app’s public CloudKit database with a record id of: `BlockchainDBClientID`

### (Android) Firebase

To enable Firebase services like Crashlytics, add the `google-services.json` file into the `brd-android/app` directory.
Without this file, runtime Firebase dependencies are still used but do not start and the Google Services gradle plugin is disabled so builds will succeed.


## Gradle Tasks

Here is a list of the most useful gradle tasks available.
For a comprehensive list of tasks run `./gradlew tasks` or `./gradlew :<module-name>:tasks`.


Build
```shell
# Build, test, and package all modules
./gradlew build
# Run all quality checks
./gradlew check
# Assemble BRD Android
./gradlew brd-android:app:assemble
```

Tests
```shell
# Run all tests, in all modules
./gradlew allTest
# Run all tests, in a single module
./gradlew :cosmos-brd-api-client:allTest
# Run Jvm tests
./gradlew jvmTest
# Run iOS Simulator tests
./gradlew iosX64Test
```

Packaging
```shell
# Package Jvm artifacts
./gradlew jvmJar
# Package iOS Frameworks (Simulator)
./gradlew linkDebugFrameworkIosX64 linkReleaseFrameworkIosX64
# Package iOS Frameworks (Device)
./gradlew linkDebugFrameworkIosArm64 linkReleaseFrameworkIosArm64
```


## Licensing

**eCoin** source code is available under the terms of the Business Source License 1.1 (`BUSL-1.1`), see [`LICENSE`](./LICENSE).

[WalletKit](https://github.com/blockset-corp/walletkit) is available under the terms of the MIT License.
