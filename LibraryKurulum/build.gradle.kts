// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript{
    dependencies{
        classpath("androidx.navigation:navigation-safe-args-gradle-plugin:2.7.7")
        classpath ("com.google.dagger:hilt-android-gradle-plugin:2.38.1")
    }
}
plugins {
    id("com.android.application") version "8.1.3" apply false
    id("org.jetbrains.kotlin.android") version "1.9.0" apply false
    //id("com.google.androdi.libraries.mapsplatform.secrets-gradle-plugin") version "2.0.1" apply false
    //id("com.google.gms.google-services") version "4.4.1" apply false
}