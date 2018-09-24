package factorymethod

/**
 * プロサッカー選手具象クラス
 */
class ProfessionalSoccerAthlete(name: String): ProfessionalAthlete(Type.Soccer) {

    private val name = name

    override fun athletesOath() {
        print("宣誓！私は" + name + "です。プロ【" + myType.value + "】選手としてサッカーボールを使い正々堂々プレーします！")
    }
}