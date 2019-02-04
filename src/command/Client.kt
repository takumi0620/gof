package command

class Client {

    init {
        val receiver = Car("プリウス")
        createStartAndRunAndStopCarCommand(receiver).execute()
    }

    private fun createStartAndRunAndStopCarCommand(receiver: Car): Command {
        val startAndRunAndStopCarCommand = MacroCommand()
        startAndRunAndStopCarCommand.addCommand(createStartCarCommand(receiver))

        val runCommand = createCarRunCommand(receiver)
        startAndRunAndStopCarCommand.addCommand(runCommand)
        startAndRunAndStopCarCommand.addCommand(runCommand)
        startAndRunAndStopCarCommand.addCommand(runCommand)
        startAndRunAndStopCarCommand.addCommand(runCommand)

        startAndRunAndStopCarCommand.addCommand(createStopCarCommand(receiver))

        return startAndRunAndStopCarCommand
    }

    private fun createStartCarCommand(receiver: Car): Command {
        val startCarCommand = MacroCommand()
        startCarCommand.addCommand(SimpleCommand(receiver, "unlock"))
        startCarCommand.addCommand(SimpleCommand(receiver, "openDoor"))
        startCarCommand.addCommand(SimpleCommand(receiver, "engineStart"))
        return startCarCommand
    }

    private fun createCarRunCommand(receiver: Car): Command {
        return SimpleCommand(receiver, "pushAxelPedal")
    }

    private fun createStopCarCommand(receiver: Car): Command {
        val stopCarCommand = MacroCommand()
        stopCarCommand.addCommand(SimpleCommand(receiver, "engineStop"))
        stopCarCommand.addCommand(SimpleCommand(receiver, "openDoor"))
        stopCarCommand.addCommand(SimpleCommand(receiver, "lock"))
        return stopCarCommand
    }
}