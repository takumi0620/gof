package templatemethod

class Client {
    init {
        val intArray = arrayOf(332, 1, 13, 3232, 456, 22, 5)
        println("Int配列ソート前")
        intArray.forEach {
            println(it)
        }
        // 並べ替え
        IntBubbleSort().sort(intArray)
        println("Int配列ソート後")
        intArray.forEach {
            println(it)
        }

        val doubleArray = arrayOf(10.01, 10.5, 10.4123, 10.12, 10.87)
        println("Double配列ソート前")
        doubleArray.forEach {
            println(it)
        }
        // 並べ替え
        DoubleBubbleSort().sort(doubleArray)
        println("Double配列ソート後")
        doubleArray.forEach {
            println(it)
        }
    }
}