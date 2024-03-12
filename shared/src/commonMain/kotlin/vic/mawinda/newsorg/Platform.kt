package vic.mawinda.newsorg

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform