package iterator

class ConcreteIterator<T>(vararg elements: T): Iterator<T> {

    override var index = 0
    override var list = ArrayList<T>()

    init {
        list.addAll(elements)
    }

    override fun elementAt(index: Int): T {
        return list[index]
    }

    override fun hasNext(): Boolean {
        return index != list.size
    }

    override fun next(): T {
        return list[index++]
    }

    override fun add(element: T) {
        list.add(element)
    }

    override fun remove(index: Int) {
        list.removeAt(index)
    }
}