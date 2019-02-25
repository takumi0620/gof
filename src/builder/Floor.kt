package builder

/**
 * 階層クラス 1階 2階...
 * Product
 */
class Floor(floorNum: Int) {
    var floorNum = floorNum
    private val roomList:MutableList<Room> = mutableListOf()

    /**
     * 部屋を追加する
     */
    fun addRoom(roomNo: Int) {
        if (roomList.asSequence().filter { room -> room.roomNo == roomNo }.count() == 0) {
            roomList.add(Room(roomNo))
        }
    }

    fun show(): String {
        var ret: String = "【階層】$floorNum 階 "
        for (room in roomList) {
            ret += room.show()
        }
        return ret
    }
}