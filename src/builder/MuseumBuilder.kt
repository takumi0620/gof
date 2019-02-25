package builder

/**
 * 博物館専門建築業者
 * ConcreteBuilder
 */
class MuseumBuilder(productName: String): Builder {
    private var product = Product(Builder.ProductType.Museum, productName)

    override fun getProduct(): Product {
        product.countUpProductNumber()
        return product.clone() as Product
    }

    override fun addFloor(floorNum: Int) {
        if (product.floorList.asSequence().filter { floor -> floor.floorNum == floorNum }.count() == 0) {
            product.floorList.add(Floor(floorNum))
        }
    }

    override fun addRoom(targetFloor: Int, roomNo: Int) {
        val floor= product.floorList.filter { floor -> floor.floorNum== targetFloor }
        if (floor.count() > 0) {
            floor[0].addRoom(roomNo)
        }
    }

}