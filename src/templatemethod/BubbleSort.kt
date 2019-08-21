package templatemethod

abstract class BubbleSort {
    private var operations = 0
    protected var length = 0

    protected fun doSort(): Int {
        operations = 0
        if (length <= 1) return operations

        for (nextToLast in length - 1 downTo 0) {
            for (index in 0 until nextToLast) {
                if (outOfOrder(index)) swap(index)
                operations++
            }
        }
        return operations
    }

    protected abstract fun swap(index: Int)
    protected abstract fun outOfOrder(index: Int): Boolean
}