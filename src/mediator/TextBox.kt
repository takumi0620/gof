package mediator

class TextBox(override val mediator: Mediator): Colleague {
    override val type = Colleague.Type.TextBox
    var value = ""

    fun input(value: String) {
        if (mediator.inputTextBox()) {
            this.value = value
            println("テキストボックス入力成功")
        } else {
            println("テキストボックス入力失敗")
        }
    }
}