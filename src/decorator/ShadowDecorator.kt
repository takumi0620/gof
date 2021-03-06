package decorator

/**
 * ConcreteDecorator Decoratorクラスの具象クラス
 */
class ShadowDecorator(viewComponent: ViewComponent): ViewComponent {
    val viewComponent = viewComponent

    override fun draw() {
        viewComponent.draw()
        addShadow()
    }

    private fun addShadow() {
        print("：影付き")
    }
}