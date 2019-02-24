package interpreter.example3

object Client {
    @JvmStatic
    fun main(args: Array<String>) {
        val source = "<+> 1 <+> 2 3 4 5 6 <+> 7 8 </+> 9 </+> 10 11 </+>"
        val context = Context(source)
        val expression = NonterminalExpression()

        println(expression.Interpret(context))
        println(expression.toString())
    }
}