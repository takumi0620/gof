package bridge

class AbstColorIcon: AbstIcon(IconType.Color) {

    override fun getType(): String {
        return AbstIcon.IconType.Color.value
    }

    // カラーアイコン独自処理色々
}