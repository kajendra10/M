plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.jetbrainsKotlinAndroid)
    //id("com.github.bumptech.glide") version "4.16.0"
}

android {
    namespace = "com.kjprojects.pmmvvmarchitecture"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.kjprojects.pmmvvmarchitecture"
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
    kotlinOptions {
        jvmTarget = "1.8"
    }

    buildFeatures {
        viewBinding = true
    }
}

dependencies {
    implementation("com.github.bumptech.glide:glide:4.16.0")

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    //Lifecycle
    implementation(libs.androidx.lifecycle)
    implementation(libs.androidx.runtime)
    implementation(libs.androidx.viewmodel)
    implementation(libs.androidx.livedata)

    //ViewModel
    implementation(libs.androidx.activity.ktx)
}