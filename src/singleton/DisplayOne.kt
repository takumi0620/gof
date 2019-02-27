package singleton

/**
 * 画面1クラス
 * Singleton
 */
class DisplayOne {
    fun draw() {
        println("User1で${JavaSingletonObject.instance.getAssets(JavaSingletonObject.Assets.IMAGE1)}を描画!!")
    }
}