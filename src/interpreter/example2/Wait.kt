package interpreter.example2

/**
 * 「待つ」という処理を表すクラス
 */
class Wait(private val minutes: Int, private val operand: Operand) : Operator {

    /**
     * 処理を実行するメソッド
     * @return string
     */
    override fun execute(): Operand {
        return Ingredient(operand!!.operandString + "を" + minutes + "分置いたもの")
    }
}