package interpreter.example1

/*
 *  BooleanExp
 *
 *  役割：<AbstractExpression>
 */
abstract class BooleanExp : Cloneable {

    abstract fun evaluate(aContext: Context): Boolean
    abstract fun replace(name: String, exp: BooleanExp): BooleanExp

    public override fun clone(): Any {
        return super.clone()
    }
}
