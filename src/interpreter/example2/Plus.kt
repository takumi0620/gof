package interpreter.example2

/**
 * 足し合わせる処理を表すクラス
 */
class Plus(private val operand1: Operand, private val operand2: Operand) : Operator {

    /**
     * 処理を実行するメソッド
     * @return string
     */
    override fun execute(): Operand {
        return Ingredient(operand1.operandString + "と" + operand2.operandString + "を足したもの")
    }
}