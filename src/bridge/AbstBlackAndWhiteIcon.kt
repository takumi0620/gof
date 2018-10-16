package bridge

class AbstBlackAndWhiteIcon: AbstIcon(IconType.BlackAndWhite) {
    override fun getType(): String {
        return AbstIcon.IconType.BlackAndWhite.value
    }

    // モノクロアイコン独自処理色々
}