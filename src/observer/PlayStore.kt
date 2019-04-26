package observer

class PlayStore {
    interface UpdateListener {
        fun update(latestVersion: Int)
    }

    private val listeners = ArrayList<UpdateListener>()

    fun update(latestVersion: Int) {
        println("サンプルアプリが${latestVersion}にアップデートされました。")
        listeners.forEach {
            it.update(latestVersion)
        }
    }

    fun addListener(listener: UpdateListener) {
        listeners.add(listener)
    }
}