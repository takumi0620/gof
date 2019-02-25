package interpreter

import java.util.*

/**
 * Context
 */
class Context(source: String) {
    private val tokens: StringTokenizer = StringTokenizer(source)
    var token: String? = null
        private set

    val isEnd: Boolean
        get() = !tokens.hasMoreElements()

    init {
        nextToken()
    }

    fun nextToken() {
        var token: String? = null
        if (!isEnd) {
            token = tokens.nextToken() // 標準の .nextToken() を呼び出す
        }
        this.token = token
    }
}