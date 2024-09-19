package com.meet.bottom_navigation_bar_navigation_rail

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Bottom-Navigation-Bar-Navigation-Rail",
    ) {
        App()
    }
}