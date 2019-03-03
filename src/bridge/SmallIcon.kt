package bridge

/**
 * ConcreteImplementor Implementorクラスを拡張したクラス
 */
class SmallIcon(iconType: AbstIcon.IconType): ImpIcon {

    private val iconType = iconType

    override fun getIcon(): String {
        return "【タイプ】：" + iconType.value + "【サイズ】：" + ImpIcon.IconSize.Small.value
    }
}