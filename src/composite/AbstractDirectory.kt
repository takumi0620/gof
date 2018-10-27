package composite

abstract class AbstractDirectory: Element {
    var elementList:MutableList<Element> = mutableListOf()

    abstract fun addElement(element: Element)
}