package mediator

interface Mediator {

    /**
     * ボタン押下可否
     */
    fun buttonPress(): Boolean

    /**
     * テキストボックス入力可否
     */
    fun inputTextBox(): Boolean
}