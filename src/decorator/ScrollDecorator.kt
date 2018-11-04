package decorator

class ScrollDecorator(viewComponent: ViewComponent): ViewComponent {
    val viewComponent = viewComponent

    override fun draw() {
        viewComponent.draw()
        addScroll()
    }

    private fun addScroll() {
        print("：スクロール可能")
    }

}