package bridge

/**
 * Abstraction 抽象クラス
 */
abstract class AbstIcon(iconType: IconType) {
    enum class IconType(val value: String) {
        BlackAndWhite("モノクロアイコン"),
        Color("カラーアイコン"),
        Clear("クリアアイコン")
    }

    private var bigIcon: ImpIcon = BigIcon(iconType)
    private var middleIcon: ImpIcon = MiddleIcon(iconType)
    private var smallIcon: ImpIcon = SmallIcon(iconType)

    abstract fun getType(): String

    fun getBigIcon(): ImpIcon {
        return bigIcon
    }

    fun getMiddleIcon(): ImpIcon {
        return middleIcon
    }

    fun getSmallIcon(): ImpIcon {
        return smallIcon
    }
}