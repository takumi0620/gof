package proxy

class Image(private val filePath: String) {

    init {
        loadImage(filePath)
    }

    fun draw() {
        println("${filePath}を描画")
    }

    private fun loadImage(filePath: String) {
        println("${filePath}を読み込み")
    }
}