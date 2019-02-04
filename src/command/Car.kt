package command

class Car(private val name: String): Receiver {

    override fun getName(): String {
        return "レシーバは${name}オブジェクトです"
    }

    fun openDoor() {
        println("ドアを開ける")
    }

    fun engineStart() {
        println("エンジンスタート")
    }

    fun engineStop() {
        println("エンジンストップ")
    }

    fun lock() {
        println("ロックする")
    }

    fun unlock() {
        println("ロックを解除する")
    }

    fun pushAxelPedal() {
        println("アクセルを踏む")
    }

    fun pushBreakePedal() {
        println("ブレーキペダルを踏む")
    }
}