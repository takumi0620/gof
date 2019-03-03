package bridge

/**
 * Implementor 具象クラス
 */
interface ImpIcon {
    enum class IconSize(val value: String) {
        Big("大アイコン"),
        Middle("中アイコン"),
        Small("小アイコン")
    }

    fun getIcon(): String
}