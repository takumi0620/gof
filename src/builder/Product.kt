package builder

/**
 * 建物
 */
class Product(productType: Builder.ProductType, productName: String): Cloneable {

    var productType = productType
    val floorList: MutableList<Floor> = mutableListOf()
    var productName = productName
    var productNumber = 0

    fun countUpProductNumber() {
        productNumber++
    }

    fun show(): String {
        var ret = "【建物】${productType.value}:$productName$productNumber 棟目"
        for (floor in floorList) {
            ret += floor.show()
        }
        return ret
    }

    public override fun clone(): Any {
        return super.clone()
    }

}