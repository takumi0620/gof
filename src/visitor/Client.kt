package visitor

class Client {
    init {
        serveCurry()
        println("--------------------------------")
        serveFriedVegetables()
    }

    private fun serveFriedVegetables() {
        val pot = PotatoElement()
        val c = CarrotElement()
        val por = PorkElement()
        val o = OtherElement()
        val v = FriedVegetablesVisitor()

        pot.cooking(v)
        c.cooking(v)
        por.cooking(v)
        v.serve()
        o.cooking(v)
        v.serve()
    }

    private fun serveCurry() {
        val pot = PotatoElement()
        val c = CarrotElement()
        val por = PorkElement()
        val o = OtherElement()
        val v = CurryVisitor()

        pot.cooking(v)
        c.cooking(v)
        por.cooking(v)
        v.serve()
        o.cooking(v)
        v.serve()
    }
}