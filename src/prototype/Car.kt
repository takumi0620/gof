package prototype

/**
 * 車クラス
 */
class Car(engine: Engine, tire: Tire) {
    val engine = engine
    val tire = tire

    fun show() {
        print("【製品】車 ")
        engine.show()
        tire.show()
        print("\n")
    }
}