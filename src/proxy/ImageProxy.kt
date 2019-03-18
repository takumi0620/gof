package proxy

/**
 * Proxy 影武者クラス
 */
class ImageProxy(private val filePath: String): Subject {
    var image: Image? = null

    override fun draw() {
        image?.let { unwrapImage ->
            unwrapImage.draw()
        } ?: run {
            val tmpImage = Image(filePath)
            tmpImage.draw()
            image = tmpImage
        }
    }
}