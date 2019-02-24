package interpreter.example1

fun main(args: Array<String>) {
    val context = Context()
    val x = VariableExp("X")
    val y = VariableExp("Y")
    val expression = OrExp(AndExp(Constant(true), x), AndExp(y, NotExp(x)))
    context.assign(x, false)
    context.assign(y, true)

    val result1 = expression.evaluate(context)
    val z = VariableExp("Z")
    val not_z = NotExp(z)
    val replacement = expression.replace("Y", not_z)

    context.assign(z, true)
    val result2 = replacement.evaluate(context)
}