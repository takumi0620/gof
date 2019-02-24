package interpreter.example2

/**
 * 処理結果を表すクラス
 */
class Expression(private val operator: Operator) : Operand {

    /**
     * 処理の結果得られる Operand の文字列表現を返すメソッド
     * @return　operandString
     */
    override val operandString: String
        get() = operator.execute().operandString
}