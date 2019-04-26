package observer

class RaidenSmartPhone(playStore: PlayStore) {
    init {
        playStore.addListener(object: PlayStore.UpdateListener {
            override fun update(latestVersion: Int) {
                println("雷電のスマホのサンプルアプリが${latestVersion}にアップデートされました。")
            }
        })
    }
}