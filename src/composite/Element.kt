package composite

/**
 * Component 根、節、葉の抽象クラス
 */
interface Element {
    enum class ElementType(val type: String) {
        DIRECTORY("Direcotry"),
        FILE("File")
    }

    fun getType(): ElementType
    fun getName(): String
}