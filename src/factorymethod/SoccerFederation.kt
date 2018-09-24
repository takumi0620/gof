package factorymethod

/**
 * サッカー連盟具象クラス
 */
class SoccerFederation: SportsFederation() {
    override fun dispatchRepresentativeAthlete(): ProfessionalAthlete {
        return ProfessionalSoccerAthlete("サカ田 代表太郎")
    }
}