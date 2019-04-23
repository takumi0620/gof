package memento

class Client {
    init {
        // メモリーカードを指す
        val memoryCard = MemoryCard()

        // ゲームスタート
        var game = Game(1, 0, 0)
        // 敵撃破
        game.enemyDown(1)
        game.enemyDown(5)
        game.enemyDown(6)

        // セーブ
        memoryCard.save(game.getData())

        // 現在の状態
        game.show()

        // 敵撃破
        game.enemyDown(4)
        game.enemyDown(2)
        game.enemyDown(8)

        // セーブ
        memoryCard.save(game.getData())

        // 現在の状態
        game.show()

        // 獲得し損ねたアイテムがあったため最初にセーブした状態へと戻す
        game = memoryCard.load(0)

        // 現在の状態
        game.show()
    }
}