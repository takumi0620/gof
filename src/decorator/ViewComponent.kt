package decorator

/**
 * Component 責任を動的に追加できるインターフェースを定義した抽象クラス
 * Decorator Componentクラスに責任を追加するインターフェースを定義した抽象クラス
 */
interface ViewComponent {
    fun draw()
}