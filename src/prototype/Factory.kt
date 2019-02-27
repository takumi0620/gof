package prototype

/**
 * 車製造工場クラス
 * Client 複製を依頼するクラス
 */
class Factory {
    var carList:MutableList<Car> = mutableListOf()
    var prototypeFactory = ProtoTypeFactory()
    init {

        // 排気量を1000ccに設定
        prototypeFactory.engine.displacement = 1000
        // 排気量1000ccの車を3台量産する
        massProduction(3)

        // 排気量を2000ccに設定
        prototypeFactory.engine.displacement = 2000
        // 排気量2000ccの車を2台量産する
        massProduction(2)

        // 排気量を12000ccに設定
        prototypeFactory.engine.displacement = 12000
        // タイヤを8本に設定
        prototypeFactory.tire.num = 8
        // 排気量12000cc タイヤ8本の車を5台量産する バス？
        massProduction(5)

        for (car in carList) {
            car.show()
        }
    }

    private fun massProduction(num: Int) {
        for (i in 0..num) {
            carList.add(Car(prototypeFactory.createEngine(), prototypeFactory.createTire()))
        }
    }
}