package chainofresponsibility

/**
 * ConcreteHandler Handlerの具象クラス
 */
class Button(parent: View?, messageType: View.MessageType): View(parent, messageType) {

    fun action(arg: Int) {
        if (arg == 0) {
            println("正常終了")
        } else {
            handleHelp()
        }
    }

    override fun helpLogic() {
        println("ボタンに起因する不具合!")
    }
}