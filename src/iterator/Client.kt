package iterator

class Client {
    init {
        val strIterator = makeStrIterator()
        while(strIterator.hasNext()) {
            println(strIterator.next())
        }

        val intIterator = makeIntIterator()
        while (intIterator.hasNext()) {
            println(intIterator.next())
        }
    }

    private fun makeStrIterator(): Iterator<String> {
        val iterator = ConcreteIterator("いち", "に", "さん")
        iterator.add("よん")

        return iterator
    }

    private fun makeIntIterator(): Iterator<Int> {
        return ConcreteIterator(1, 2, 3)
    }
}