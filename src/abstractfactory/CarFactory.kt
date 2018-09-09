package abstractfactory

/**
 * 普通の車用部品製造工場
 */
open class CarFactory {

    open fun makeEngine(displacement: Int): Engine {
        return Engine(displacement)
    }

    open fun makeTire(position: Int): Tire {
        return Tire(position)
    }

    open fun makeSteering(weight: Int): Steering {
        return Steering(weight)
    }

}