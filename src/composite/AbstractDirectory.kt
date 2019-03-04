package composite

/**
 * Composite 根または節
 */
abstract class AbstractDirectory: Element {
    var elementList:MutableList<Element> = mutableListOf()

    abstract fun addElement(element: Element)
}