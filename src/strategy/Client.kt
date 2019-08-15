package strategy

class Client {
    init {
        val array1 = arrayOf(33.5, 5.4, 5.0, 225.4, 225.3)
        val array2 = arrayOf(10.4, 10.2, 10.5, 10.1, 10.3, 10.6)

        val doubleSort = DoubleSort()

        // バブルソート
        BubbleSort(doubleSort).sort(array1)

        println("バブルソート結果")
        array1.forEach {
            println("$it")
        }

        // シェーカーソート
        ShakerSort(doubleSort).sort(array2)

        println("シェーカーソート結果")
        array2.forEach {
            println("$it")
        }
    }
}