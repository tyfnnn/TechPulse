package de.visualstories.dailypulse

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform