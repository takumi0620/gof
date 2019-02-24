package interpreter

class TerminalExpression: Expression {
    private var saveToken: String? = null

    override fun interpret(context: Context): Int {
        saveToken = context.token
        context.nextToken()
        return Integer.parseInt(saveToken ?: "0")
    }

    override fun toString(): String {
        return saveToken ?: "0"
    }
}