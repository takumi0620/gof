package chainofresponsibility

/**
 * ConcreteHandler Handlerの具象クラス
 */
class Window(parent: View?, messageType: View.MessageType): View(parent, messageType) {

    override fun helpLogic() {
        println("ウインドウに起因する不具合!")
    }
}