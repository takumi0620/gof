package facade

class Client {
    init {
        val printer = FacadePrinter()
        printer.printOut(15)

        // 他のメソッドは使用できない
        // printer.startUp()
        // pritner.shutDown()
    }
}