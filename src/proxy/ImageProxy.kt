package proxy

class ImageProxy(private val filePath: String) {
    var image: Image? = null

    fun draw() {
        image?.let { unwrapImage ->
            unwrapImage.draw()
        } ?: run {
            val tmpImage = Image(filePath)
            tmpImage.draw()
            image = tmpImage
        }
    }
}