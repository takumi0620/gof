package visitor

interface Element {
    fun name(): String
    fun cooking(v: Visitor)
}