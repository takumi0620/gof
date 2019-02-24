package interpreter.example3

import java.util.ArrayList


class NonterminalExpression : AbstractExpression() {
    private var resultValue = 0
    private val startTagPlus = "<+>"
    private val endTagPlus = "</+>"
    private val list = ArrayList<AbstractExpression>()

    override fun Interpret(context: Context): Int {
        context.nextToken()
        while (!context.isEnd) {
            val token = context.token
            val childExpressions = if (startTagPlus == token) {
                NonterminalExpression()
            } else if (endTagPlus == token) {
                context.nextToken()
                break
            } else {
                TerminalExpression()
            }
            resultValue += childExpressions.Interpret(context)
            list.add(childExpressions)
        }
        return resultValue
    }

    override fun toString(): String {
        return "+" + list.toString()
    }
}