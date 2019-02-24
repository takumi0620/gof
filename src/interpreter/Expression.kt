package interpreter

interface Expression {
    enum class Operator(val startTag: String, val endTag: String) {
        Plus("<+>", "</+>"),
        Minus("<->", "</->"),
        Multiplication("<*>", "</*>"),
        Divide("</>", "<//>"),
    }
    fun interpret(context: Context): Int

    companion object {
        fun getExpression(token: String?): Expression? {
            return when (token) {
                Operator.Plus.startTag -> {
                    PlusNonterminalExpression()
                }
                Operator.Minus.startTag -> {
                    MinusNonterminalExpression()
                }
                Operator.Multiplication.startTag -> {
                    MultiplicationExpression()
                }
                Operator.Divide.startTag -> {
                    DivideExpression()
                }
                Operator.Plus.endTag,
                Operator.Minus.endTag,
                Operator.Multiplication.endTag,
                Operator.Divide.endTag -> {
                    null
                }
                else -> {
                    TerminalExpression()
                }
            }
        }
    }
}