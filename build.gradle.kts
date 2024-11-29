// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    id("com.google.firebase.crashlytics") version "2.9.2" apply false
    id("com.google.firebase.firebase-perf") version "1.4.2" apply false
    alias(libs.plugins.google.gms.google.services) apply false
}

