package visitor

class CarrotElement: Element {
    override fun name(): String {
        return "にんじん"
    }

    override fun cooking(v: Visitor) {
        v.visit(this)
    }
}