package memento

class SaveData(val level: Int, val gold: Int, val point: Int) {
    fun show() {
        println("レベル：$level 所持金：$gold 経験値：$point")
    }
}