package decorator

/**
 * ConcreteComponent Componentクラスの具象クラス
 */
class TextView: ViewComponent {
    override fun draw() {
        print("【テキストビュー】")
    }
}