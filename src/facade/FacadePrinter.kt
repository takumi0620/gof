package facade

/**
 * Facade クライアントがサブシステムを利用するにあたって必要最低限のインターフェースを定義するクラス
 */
class FacadePrinter {
    private val printer = Printer()

    fun printOut(num: Int) {
        printer.printOut(num)
    }
}