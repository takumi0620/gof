package chainofresponsibility

/**
 * ConcreteHandler Handlerの具象クラス
 */
class Dialog(parent: View?, messageType: View.MessageType): View(parent, messageType) {

    override fun helpLogic() {
        println("ダイアログに起因する不具合!")
    }
}