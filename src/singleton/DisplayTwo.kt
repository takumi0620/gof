package singleton

/**
 * 画面2クラス
 * Singleton
 */
class DisplayTwo {
    fun start() {
        println("User2で${JavaSingletonObject.instance.getAssets(JavaSingletonObject.Assets.AUDIO1)}を再生!!")
    }
}