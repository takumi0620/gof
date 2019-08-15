package strategy

class BubbleSort(private val sort: Sort) {
    private var operations = 0
    private var length = 0

    fun sort(array: Any): Int {
        sort.setArray(array)
        length = sort.length()
        operations = 0

        if (length <= 1) {
            return operations
        }

        for (nextToLast in length - 2 downTo 0) {
            for (index in 0..nextToLast) {
                if (sort.outOfOrder(index)) {
                    sort.swap(index)
                }
                operations++
            }
        }

        return operations
    }
}