package command

class SimpleCommand(private val receiver: Receiver, private val method: String): Command {
    override fun execute() {
        receiver.javaClass.getDeclaredMethod(method).invoke(receiver)
    }
}