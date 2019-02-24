package chainofresponsibility

abstract class View(private val parent: View?, private val messageType: MessageType) {
    enum class MessageType {
        Normal,
        Warning,
        Danger
    }

    protected fun handleHelp() {
        if (hasMessage()) {
            helpLogic()
        } else {
            parent?.handleHelp()
        }
    }

    abstract fun helpLogic()

    private fun hasMessage(): Boolean {
        val ret = MessageType.Normal != messageType

        if (ret) {
            createDialog()
        }
        return ret
    }

    private fun createDialog() {
        when (messageType) {
            MessageType.Warning -> {
                print("警告ダイアログ：")
            }
            MessageType.Danger -> {
                print("エラーダイアログ：")
            }
        }
    }

}