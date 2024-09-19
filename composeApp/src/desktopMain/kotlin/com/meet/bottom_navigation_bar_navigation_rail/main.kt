package com.meet.bottom_navigation_bar_navigation_rail

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import java.awt.Dimension

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Bottom-Navigation-Bar-Navigation-Rail",
    ) {
        window.minimumSize = Dimension( 640, 480)
        App()
    }
}