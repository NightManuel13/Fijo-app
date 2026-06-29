package unitec.machigues.fijo

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform