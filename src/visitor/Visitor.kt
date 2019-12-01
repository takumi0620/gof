package visitor

interface Visitor {
    fun visit(e: PotatoElement)
    fun visit(e: CarrotElement)
    fun visit(e: PorkElement)
    fun visit(e: OtherElement)
    fun serve()
}