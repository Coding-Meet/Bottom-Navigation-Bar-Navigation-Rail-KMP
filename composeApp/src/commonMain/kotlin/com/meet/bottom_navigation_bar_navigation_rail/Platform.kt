package com.meet.bottom_navigation_bar_navigation_rail

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform