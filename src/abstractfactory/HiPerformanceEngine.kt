package abstractfactory

/**
 * 高出力エンジン
 * ConcreteProduct
 */
class HiPerformanceEngine(displacement: Int): Engine(displacement) {
    override val type = "高出力エンジン"
}