plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "nguyenvu.com.zalopaydemoapp"
    compileSdk = 34

    defaultConfig {
        applicationId = "nguyenvu.com.zalopaydemoapp"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    implementation(files("C:/Users/RLappc.com/Downloads/zpdk-release-v3.1.aar"))
    testImplementation(libs.junit)
    implementation(libs.okhttp)
    implementation(libs.commons.codec)

    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
    implementation("org.jetbrains.kotlin:kotlin-script-runtime:1.8.22")
}