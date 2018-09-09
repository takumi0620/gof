package abstractfactory

/**
 * 普通のタイヤ
 */
open class Tire(position: Int) {
    open val type = "普通のタイヤ"
    val position = position
}
