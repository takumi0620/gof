package strategy

class ShakerSort(private val sort: Sort) {

    fun sort(array: Any): Int {
        sort.setArray(array)
        var length = sort.length()
        var operations = 0

        if (length <= 1) {
            return operations
        }

        var thisPassInOrder = false

        loop@ for (nextToLast in length - 2 downTo 0) {
            if (thisPassInOrder) {
                break@loop
            }

            thisPassInOrder = true
            for (index in 0..nextToLast) {
                if (sort.outOfOrder(index)) {
                    sort.swap(index)
                    thisPassInOrder = false
                }
                operations++
            }
        }
        return operations
    }
}