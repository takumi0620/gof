package factorymethod

/**
 * 野球連盟具象クラス
 * ConcreteCreator
 */
class BaseBallFederation: SportsFederation() {
    override fun dispatchRepresentativeAthlete(): ProfessionalAthlete {
        return ProfessionalBaseBallAthlete("野球本 キャプテン男")
    }
}