package interpreter.example2

/**
 * 処理対象を表すインタフェース
 */
interface Operand {
    /**
     * 処理対象を表す文字列を返すメソッドです。
     * @return operandString
     */
    val operandString: String
}