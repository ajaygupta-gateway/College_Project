package org.ajay.bookipedia

import androidx.compose.ui.window.ComposeUIViewController
import org.ajay.bookipedia.app.App
import org.ajay.bookipedia.di.initKoin

fun MainViewController() = ComposeUIViewController(
    configure = {
        initKoin()
    }
) { App() }