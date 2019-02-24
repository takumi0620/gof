package interpreter.example1

/*
 *  OrExp
 *
 *  役割：<NonterminalExpression>
 */
class OrExp(private val _operand1: BooleanExp, private val _operand2: BooleanExp) : BooleanExp() {

    override fun evaluate(aContext: Context): Boolean {
        return _operand1.evaluate(aContext) || _operand2.evaluate(aContext)
    }

    override fun replace(name: String, exp: BooleanExp): BooleanExp {
        return OrExp(_operand1.replace(name, exp), _operand2.replace(name, exp))
    }

    override fun clone(): Any {
        return OrExp(_operand1.clone() as BooleanExp, _operand2.clone() as BooleanExp)
    }
}