package abstractfactory

/**
 * ConcreteProduct
 */
class HiGripTire(position: Int): Tire(position) {
    override val type = "ハイグリップタイヤ"
}