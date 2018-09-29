package singleton

/**
 * 画面管理クラス
 */
class Manager {
    init {
        DisplayOne().draw()
        DisplayTwo().start()
    }
}