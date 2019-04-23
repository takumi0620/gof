package memento

class Game(private var level: Int, private var gold: Int, private var point: Int) {

    fun show() {
        println("レベル：$level 所持金：$gold 経験値：$point")
    }

    /**
     * 敵を倒した
     */
    fun enemyDown(enemyLevel: Int) {
        point += enemyLevel

        if (point >= 10) {
            level += point / 10
            point %= 10
        }

        gold += enemyLevel
    }

    /**
     * 現在の状態を取得
     */
    fun getData(): SaveData {
        return SaveData(level, gold, point)
    }
}