package abstractfactory

/**
 * エンジン
 */
open class Engine(displacement: Int) {
    open val type = "普通のエンジン"
    val displacement = displacement
}