package interpreter.example2

/**
 * 処理を表すインタフェース
 */
interface Operator {
    /**
     * 実行結果の operand を返すメソッド
     * @return operand
     */
    fun execute(): Operand
}