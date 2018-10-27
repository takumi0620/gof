package composite

class Directory(private val name: String): AbstractDirectory() {

    override fun getType(): Element.ElementType {
        return Element.ElementType.DIRECTORY
    }

    override fun addElement(element: Element) {
        elementList.add(element)
    }

    override fun getName(): String {
        return name
    }
}