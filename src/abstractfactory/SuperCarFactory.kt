package abstractfactory

/**
 * スーパーカー用部品製造工場
 * ConcreteFactory
 */
class SuperCarFactory: CarFactory() {

    override fun makeEngine(displacement: Int): Engine {
        return HiPerformanceEngine(displacement)
    }

    override fun makeTire(position: Int): Tire {
        return HiGripTire(position)
    }
}