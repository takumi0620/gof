package composite

class File(private val name: String): Element {

    override fun getType(): Element.ElementType {
        return Element.ElementType.FILE
    }

    override fun getName(): String {
        return name
    }
}