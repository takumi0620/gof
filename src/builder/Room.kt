package builder

/**
 * 部屋クラス
 */
class Room(roomNo: Int) {
    val roomNo = roomNo

    fun show(): String {
        return "【部屋】 $roomNo 号室"
    }
}