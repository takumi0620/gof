package prototype

/**
 * エンジンクラス
 */
class Engine(displacement: Int): Cloneable {
    var displacement = displacement

    fun show() {
        print("【エンジン】"+ displacement +"cc ")
    }

    public override fun clone(): Any {
        return super.clone()
    }
}