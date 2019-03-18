package flyweight

/**
 * FlyweightFactory Flyweightクラスを生成するクラス
 */
// シングルトンオブジェクトにする
object CharacterFactory {

    val characterPool = HashMap<AllCharacter, Character>()

    enum class AllCharacter(val value: Char) {
        A('A'),
        B('B'),
        C('C'),
        D('D'),
        E('E'),
        F('F'),
        G('G'),
        H('H'),
        I('I'),
        J('J'),
        K('K'),
        L('L'),
        M('M'),
        N('N'),
        O('O'),
        P('P'),
        Q('Q'),
        R('R'),
        S('S'),
        T('T'),
        U('U'),
        V('V'),
        W('W'),
        X('X'),
        Y('Y'),
        Z('Z')
    }

    fun getCharacterObject(characterType: AllCharacter): Character {
        // 未生成であれば、当該インスタンスをプールする。
        characterPool[characterType]?.let {
            return it
        } ?: run {
            val char = Character(characterType.value)
            characterPool[characterType] = char
            return char
        }
    }
}