package abstractfactory

/**
 * 製造された車
 */
open class Car(type: String, engine: Engine, tire: Tire, steering: Steering) {
    val type = type
    val engine = engine
    val tire = tire
    val steering = steering

    fun getConstitution(): String {
        return  "【車種】：" + type + "," +
                "【エンジン】：" + engine.type + "," +
                "【タイヤ】：" + tire.type + "," +
                "【ハンドル】：" + steering.type
    }
}