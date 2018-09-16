package builder

/**
 * 建築業者インターフェース
 */
interface Builder {
    enum class ProductType(val value: String) {
        ArtMuseum("美術館"),
        Museum("博物館"),
        MovieTheater("映画館")
    }

    fun getProduct(): Product
    fun addFloor(floorNum: Int)
    fun addRoom(targetFloor: Int, roomNo: Int)

}