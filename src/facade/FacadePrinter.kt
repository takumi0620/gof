package facade

class FacadePrinter {
    private val printer = Printer()

    fun printOut(num: Int) {
        printer.printOut(num)
    }
}