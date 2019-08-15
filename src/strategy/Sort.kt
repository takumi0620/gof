package strategy

interface Sort {
    fun swap(index: Int)
    fun outOfOrder(index: Int): Boolean
    fun length(): Int
    fun setArray(array: Any)
}