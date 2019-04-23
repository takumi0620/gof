package mediator

class Client {
    init {
        val mediator = ConcreteMediator()
        val checkBox = CheckBox(mediator)
        val textBox = TextBox(mediator)
        val button = Button(mediator)

        mediator.checkBox = checkBox
        mediator.textBox = textBox
        mediator.button = button

        // テキストボックス入力 チェックボックスが選択されていないため入力失敗
        textBox.input("山田太郎")

        // チェックボックス選択
        checkBox.select(CheckBox.Sex.Female)

        // ボタン押下 テキストボックスが入力されていないため失敗
        button.press()

        // テキストボックス入力 成功!!!
        textBox.input("山田花子")

        // ボタン押下 成功!!!
        button.press()
    }
}