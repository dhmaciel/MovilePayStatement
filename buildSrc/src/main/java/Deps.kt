object Deps {
    const val kotlin_stdlib =
        "org.jetbrains.kotlin:kotlin-stdlib:${Version.kotlin_std_lib}"

    const val kotlinx_coroutines_android =
        "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Version.coroutines}"

    const val kotlinx_coroutines_core =
        "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Version.coroutines}"

    const val kotlinx_coroutines_test =
        "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Version.coroutines}"

    const val androidx_core_ktx =
        "androidx.core:core-ktx:${Version.androidx_core_ktx}"

    const val androidx_app_compat =
        "androidx.core:core-ktx:${Version.androidx_app_compat}"

    const val google_material =
        "com.google.android.material:material:${Version.material}"

    const val constraint_layout =
        "androidx.constraintlayout:constraintlayout:${Version.constraint_layout}"

    const val junit =
        "junit:junit:${Version.junit}"

    const val androidx_junit =
        "androidx.test.ext:junit:${Version.androidx_junit}"

    const val espresso_core =
        "androidx.test.espresso:espresso-core:${Version.espresso_core}"

    //region koin
    const val koin_android =
        "org.koin:koin-android:${Version.koin}"

    const val koin_androidx_viewmodel =
        "org.koin:koin-androidx-viewmodel:${Version.koin}"

    const val koin_core =
        "org.koin:koin-core:${Version.koin}"
    //endregion

    const val retrofit =
        "com.squareup.retrofit2:retrofit:${Version.retrofit}"

    const val moshi =
        "com.squareup.moshi:moshi:${Version.moshi}"

    const val moshi_converter =
        "com.squareup.retrofit2:converter-moshi:${Version.moshi_converter}"

    const val moshi_kotlin =
        "com.squareup.moshi:moshi-kotlin:${Version.moshi}"

    const val logging_interceptor =
        "com.squareup.okhttp3:logging-interceptor:${Version.logging_interceptor}"

    const val mockk_android = "io.mockk:mockk-android:${Version.mockk}"

    const val mockk =
        "io.mockk:mockk:${Version.mockk}"

    const val navigation =
        "androidx.navigation:navigation-ui:${Version.nav_version}"

    const val navigation_fragment =
        "androidx.navigation:navigation-fragment:${Version.nav_version}"

    const val navigation_test =
        "androidx.navigation:navigation-testing:${Version.nav_version}"
}