package visitor

class PorkElement: Element {
    override fun name(): String {
        return "豚肉"
    }

    override fun cooking(v: Visitor) {
        v.visit(this)
    }

}