package mediator

class Button(override val mediator: Mediator): Colleague {
    override val type = Colleague.Type.Button

    fun press() {
        if (mediator.buttonPress()) {
            println("ボタン押下成功")
        } else {
            println("ボタン押下失敗")
        }
    }
}