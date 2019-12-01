package visitor

class OtherElement: Element {
    override fun name(): String {
        return "塩と胡椒"
    }

    override fun cooking(v: Visitor) {
        v.visit(this)
    }
}