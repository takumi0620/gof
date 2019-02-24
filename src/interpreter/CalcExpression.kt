package interpreter

import java.util.ArrayList

abstract class CalcExpression: Expression {
    protected val numList = ArrayList<Int>()
    protected val list = ArrayList<Expression>()

    override fun interpret(context: Context): Int {
        context.nextToken()
        loop@ while (!context.isEnd) {
            val childExpressions = Expression.getExpression(context.token)
            if (childExpressions == null) {
                context.nextToken()
                break@loop
            } else {
                numList.add(childExpressions.interpret(context))
                list.add(childExpressions)
            }
        }
        return calc()
    }

    abstract fun calc(): Int
    abstract override fun toString(): String
}