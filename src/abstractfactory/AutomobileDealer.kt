package abstractfactory

/**
 * 自動車ディーラー
 * Client
 */
class AutomobileDealer {

    val cars = mutableListOf<Car>()

    init {
        openingUp()
    }

    /**
     * ディーラーにある車一覧
     */
    fun showCars() {
        cars.forEach {
            println(it.getConstitution())
        }
    }

    /**
     * 店舗開店
     */
    private fun openingUp() {
        val maker = Maker()
        cars.add(maker.getCar())
        cars.add(maker.getSuperCar())
        cars.add(maker.getSuperCar())
    }
}