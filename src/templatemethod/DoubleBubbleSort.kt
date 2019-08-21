package templatemethod

class DoubleBubbleSort: BubbleSort() {

    private lateinit var array: Array<Double>

    fun sort(theArray: Array<Double>): Int {
        array = theArray
        length = theArray.size
        return doSort()
    }

    override fun swap(index: Int) {
        val temp = array[index]
        array[index] = array[index + 1]
        array[index + 1] = temp
    }

    override fun outOfOrder(index: Int): Boolean {
        return array[index] > array[index + 1]
    }
}