package iterator

interface Iterator<T> {
    var index: Int
    var list: ArrayList<T>

    /**
     * index番目の要素を取得する
     */
    fun elementAt(index: Int): T

    /**
     * まだ要素が残っているかを確認する
     */
    fun hasNext(): Boolean

    /**
     * 次の要素を取得する
     */
    fun next(): T

    /**
     * 要素を追加する
     */
    fun add(element: T)

    /**
     * index番目の要素を削除する
     */
    fun remove(index: Int)
}