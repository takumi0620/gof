package observer

class SnakeSmartPhone(playStore: PlayStore) {
    init {
        playStore.addListener(object: PlayStore.UpdateListener {
            override fun update(latestVersion: Int) {
                println("スネークのスマホのサンプルアプリが${latestVersion}にアップデートされました。")
            }
        })
    }
}