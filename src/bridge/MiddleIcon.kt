package bridge

/**
 * ConcreteImplementor Implementorクラスを拡張したクラス
 */
class MiddleIcon(iconType: AbstIcon.IconType): ImpIcon {

    private val iconType = iconType

    override fun getIcon(): String {
        return "【タイプ】：" + iconType.value + "【サイズ】：" + ImpIcon.IconSize.Middle.value
    }
}
