package interpreter.example1

/*
 *  NotExp
 *
 *  役割：<NonterminalExpression>
 */
class NotExp(private val _operand: BooleanExp) : BooleanExp() {

    override fun evaluate(aContext: Context): Boolean {
        return !_operand.evaluate(aContext)
    }

    override fun replace(name: String, exp: BooleanExp): BooleanExp {
        return NotExp(_operand.replace(name, exp))
    }

    override fun clone(): Any {
        return NotExp(_operand.clone() as BooleanExp)
    }
}
