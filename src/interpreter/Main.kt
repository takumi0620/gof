package interpreter

import interpreter.Expression.Companion.getExpression

/**
 * Client
 */
fun main(args: Array<String>) {
    val source = "<+> 1 <-> 2 3 4 5 6 <*> 7 8 </*> 9 </-> 10 11 </> 12 4 <//> </+>"
    val context = Context(source)
    val expression = getExpression(context.token)

    println(expression?.interpret(context))
    println(expression.toString())
}