package composite

interface Element {
    enum class ElementType(val type: String) {
        DIRECTORY("Direcotry"),
        FILE("File")
    }

    fun getType(): ElementType
    fun getName(): String
}