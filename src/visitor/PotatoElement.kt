package visitor

class PotatoElement: Element {
    override fun name(): String {
        return "じゃがいも"
    }

    override fun cooking(v: Visitor) {
        v.visit(this)
    }
}