package memento

class MemoryCard {
    private val memory = ArrayList<SaveData>()

    /**
     * セーブ（保存）
     */
    fun save(data: SaveData) {
        memory.add(data)
    }

    /**
     * ロード（復元）
     */
    fun load(index: Int): Game {
        val data = memory[index]
        return Game(data.level, data.gold, data.point)
    }
}