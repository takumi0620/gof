package singleton

/**
 * 画面2クラス
 */
class DisplayTwo {
    fun start() {
        println("User2で${JavaSingletonObject.instance.getAssets(JavaSingletonObject.Assets.AUDIO1)}を再生!!")
    }
}