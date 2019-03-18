package proxy

/**
 * RealSubject 本物クラス
 */
class Image(private val filePath: String): Subject {

    init {
        loadImage(filePath)
    }

    override fun draw() {
        println("${filePath}を描画")
    }

    private fun loadImage(filePath: String) {
        println("${filePath}を読み込み")
    }
}