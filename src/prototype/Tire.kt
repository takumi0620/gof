package prototype

/**
 * タイヤクラス
 */
class Tire(num: Int): Cloneable {
    var num = num

    fun show() {
        print("【タイヤ】" + num + "個 ")
    }

    public override fun clone(): Any {
        return super.clone()
    }
}