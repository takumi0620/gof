package factorymethod

/**
 * プロスポーツ選手抽象クラス
 */
abstract class ProfessionalAthlete(type: Type) {
    enum class Type(val value: String) {
        Soccer("サッカー"),
        BaseBall("野球")
    }

    val myType = type

    abstract fun athletesOath()
}