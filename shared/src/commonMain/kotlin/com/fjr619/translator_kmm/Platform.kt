package com.fjr619.translator_kmm

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform