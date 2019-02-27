package factorymethod

/**
 * スポーツ連盟抽象クラス
 * Creator
 */
abstract class SportsFederation {
    fun getAthlete(): ProfessionalAthlete {
        return dispatchRepresentativeAthlete()
    }

    protected abstract fun dispatchRepresentativeAthlete(): ProfessionalAthlete
}