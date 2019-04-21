package chainofresponsibility

/**
 * Client 使用者
 */
class Client {
    init {
        // ウインドウ
        val window = Window(null, View.MessageType.Danger)
        // ウインドウ直下に配置されたボタン
        val button1 = Button(window, View.MessageType.Normal)
        // ウインドウ直下に配置されたダイアログ
        val dialog = Dialog(window, View.MessageType.Normal)
        // ダイアログに配置されたボタン
        val button2 = Button(dialog, View.MessageType.Normal)

        button1.action(0)
        button1.action(1)
        button1.action(0)

        button2.action(0)
        button2.action(1)
        button2.action(0)
    }
}