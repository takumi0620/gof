package bridge

/**
 * RefinedAbstraction Abstractionクラスを拡張したクラス
 */
class AbstClearIcon: AbstIcon(IconType.Clear) {

    override fun getType(): String {
        return AbstIcon.IconType.Clear.value
    }

    // クリアアイコン独自処理色々
}