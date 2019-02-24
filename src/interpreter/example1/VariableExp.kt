package interpreter.example1

/*
 *  VariableExp
 *
 *  役割：<TerminalExpression>
 */
class VariableExp(private val name: String) : BooleanExp() {

    override fun evaluate(aContext: Context): Boolean {
        return aContext.lookup(name)
    }

    override fun replace(name: String, exp: BooleanExp): BooleanExp {
        return if (name == this.name) {
            exp.clone() as BooleanExp
        } else {
            this.clone() as BooleanExp
        }
    }

    override fun clone(): Any {
        return VariableExp(name)
    }

    fun getName(): String {
        return name
    }
}