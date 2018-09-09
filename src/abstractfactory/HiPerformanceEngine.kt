package abstractfactory

/**
 * 高出力エンジン
 */
class HiPerformanceEngine(displacement: Int): Engine(displacement) {
    override val type = "高出力エンジン"
}