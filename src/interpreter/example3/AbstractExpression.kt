package interpreter.example3

abstract class AbstractExpression {
    abstract fun Interpret(context: Context): Int
}