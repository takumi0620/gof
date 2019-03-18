package flyweight

/**
 * Flyweight 同一インスタンスを大量に生成する必要があるオブジェクトの抽象クラス
 * ConcreteFlyweight 同一インスタンスを大量に生成する必要があるオブジェクトの具象クラス
 */
class Character(private val character: Char) {
    fun print() {
        print(character)
    }
}