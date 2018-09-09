package abstractfactory

/**
 * 自動車メーカー
 */
class Maker {

    /**
     * 普通の車製造
     */
    fun getCar(): Car {
        return make("ファミリーカー", CarFactory())
    }

    /**
     * スーパーカー製造
     */
    fun getSuperCar(): Car {
        return make("スーパーカー", SuperCarFactory())
    }

    /**
     * 製造
     */
    private fun make(type: String, factory: CarFactory): Car {
        val engine = factory.makeEngine(1000)
        val tire = factory.makeTire(1)
        val steering = factory.makeSteering(100)

        return Car(type, engine, tire, steering)
    }

}