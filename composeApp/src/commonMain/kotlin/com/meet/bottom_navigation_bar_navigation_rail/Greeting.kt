package com.meet.bottom_navigation_bar_navigation_rail

class Greeting {
    private val platform = getPlatform()

    fun greet(): String {
        return "Hello, ${platform.name}!"
    }
}