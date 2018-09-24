package factorymethod

/**
 * プロ野球選手具象クラス
 */
class ProfessionalBaseBallAthlete(name: String): ProfessionalAthlete(Type.BaseBall) {

    private val name = name

    override fun athletesOath() {
        print("宣誓！私は" + name + "です。プロ【" + myType.value + "】選手としてバットと野球ボールを使い正々堂々プレーします！")
    }
}