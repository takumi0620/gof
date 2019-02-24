package interpreter.example1

/*
 *  Constant
 *
 *  役割：<TerminalExpression>
 */
class Constant(private val _value: Boolean) : BooleanExp() {

    override fun evaluate(aContext: Context): Boolean {
        return _value
    }

    override fun replace(name: String, exp: BooleanExp): BooleanExp {
        return this.clone() as BooleanExp
    }

    override fun clone(): Any {
        return Constant(_value)
    }
}