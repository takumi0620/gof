package command

import kotlin.collections.ArrayList

class MacroCommand: Command {
    private val commandList = ArrayList<Command>()

    override fun execute() {
        commandList.forEach {
            it.execute()
        }
    }

    fun addCommand(command: Command) {
        commandList.add(command)
    }

    fun removeCommand(command: Command) {
        commandList.remove(command)
    }
}