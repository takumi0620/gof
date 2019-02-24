package interpreter.example3

class TerminalExpression : AbstractExpression() {
    private var saveToken: String? = null

    override fun Interpret(context: Context): Int {
        saveToken = context.token
        context.nextToken()
        return Integer.parseInt(saveToken ?: "")
    }

    override fun toString(): String {
        return saveToken ?: ""
    }
}