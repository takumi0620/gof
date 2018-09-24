package factorymethod

/**
 * 主催者クラス
 */
class Organizer {
    init {
        var athleteList: MutableList<ProfessionalAthlete> = mutableListOf()
        // それぞれのスポーツ連盟から代表選手を派遣してもらう
        // サッカー連盟から代表選手取得
        athleteList.add(SoccerFederation().getAthlete())
        // 野球連盟から代表選手取得
        athleteList.add(BaseBallFederation().getAthlete())

        // 宣誓してもらう
        for (athlete in athleteList) {
            athlete.athletesOath()
            print("\n")
        }
    }
}