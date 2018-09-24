package factorymethod

/**
 * スポーツ連盟抽象クラス
 */
abstract class SportsFederation {
    fun getAthlete(): ProfessionalAthlete {
        return dispatchRepresentativeAthlete()
    }

    abstract fun dispatchRepresentativeAthlete(): ProfessionalAthlete
}