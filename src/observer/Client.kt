package observer

class Client {
    init {
        val playStore = PlayStore()
        SnakeSmartPhone(playStore)
        RaidenSmartPhone(playStore)

        playStore.update(1)

        playStore.update(2)
    }
}