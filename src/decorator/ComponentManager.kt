package decorator

class ComponentManager {
    init {
        // スクロール可能 影付き テキストビュー
        val scrollShadowTextView = ScrollDecorator(ShadowDecorator(TextView()))
        // スクロール可能 テキストビュー
        val scrollTextView = ScrollDecorator(TextView())

        // 描画
        scrollShadowTextView.draw()
        print("\n")
        scrollTextView.draw()
    }
}