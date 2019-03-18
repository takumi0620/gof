package flyweight

/**
 * Client 使用者
 */
class Client {
    init {
        val characters = ArrayList<Character>()
        // "BANANA"を生成します
        characters.add(CharacterFactory.getCharacterObject(CharacterFactory.AllCharacter.B))
        characters.add(CharacterFactory.getCharacterObject(CharacterFactory.AllCharacter.A))
        characters.add(CharacterFactory.getCharacterObject(CharacterFactory.AllCharacter.N))
        characters.add(CharacterFactory.getCharacterObject(CharacterFactory.AllCharacter.A))
        characters.add(CharacterFactory.getCharacterObject(CharacterFactory.AllCharacter.N))
        characters.add(CharacterFactory.getCharacterObject(CharacterFactory.AllCharacter.A))

        characters.forEach {
            it.print()
        }
    }
}