# How to Build and Run the APK

## Prerequisites
- Install [Android Studio](https://developer.android.com/studio) on your computer.
- Ensure you have the Android SDK and necessary build tools installed via Android Studio.
- Connect an Android device via USB with USB debugging enabled, or set up an Android emulator.

## Steps to Build the APK

1. Open Android Studio.
2. Select **Open an existing project** and navigate to the `AndroidProject` directory.
3. Wait for Gradle to sync and build the project.
4. To build the APK, go to **Build** > **Build Bundle(s) / APK(s)** > **Build APK(s)**.
5. After the build completes, a notification will appear with a link to the generated APK file.
6. Click the link or find the APK in `AndroidProject/app/build/outputs/apk/debug/app-debug.apk`.

## Steps to Run the APK

1. Connect your Android device or start an emulator.
2. In Android Studio, click the **Run** button or select **Run** > **Run 'app'**.
3. Choose your device or emulator.
4. The app will be installed and launched automatically.

## Alternative: Build and Install via Command Line

1. Open a terminal and navigate to the `AndroidProject` directory.
2. Run the following command to build the APK:

   ```
   ./gradlew assembleDebug
   ```

3. The APK will be generated at `app/build/outputs/apk/debug/app-debug.apk`.
4. To install the APK on a connected device, run:

   ```
   adb install -r app/build/outputs/apk/debug/app-debug.apk
   ```

5. Launch the app on your device.

## Notes

- Make sure your device allows installation from unknown sources if installing manually.
- For production release, configure signing and build a release APK.
